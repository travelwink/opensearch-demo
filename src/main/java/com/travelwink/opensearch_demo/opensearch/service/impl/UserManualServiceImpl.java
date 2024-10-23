package com.travelwink.opensearch_demo.opensearch.service.impl;

import com.travelwink.opensearch_demo.opensearch.entity.UserManual;
import com.travelwink.opensearch_demo.opensearch.repository.UserManualRepository;
import com.travelwink.opensearch_demo.opensearch.service.UserManualService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.query.Criteria;
import org.springframework.data.elasticsearch.core.query.CriteriaQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class UserManualServiceImpl implements UserManualService {

    @Autowired
    private ElasticsearchOperations operations;

    @Autowired
    private UserManualRepository userManualRepository;

    @Override
    public UserManual addEntity(UserManual userManual) {
        return userManualRepository.save(userManual);
    }

    @Override
    public List<UserManual> findByText(String keyword) {
        Criteria criteria = new Criteria("text").is(keyword);
        CriteriaQuery query = new CriteriaQuery(criteria);
        SearchHits<UserManual> searchHits = operations.search(query, UserManual.class);
        List<UserManual> userManualList = searchHits.get().map(SearchHit::getContent).collect(Collectors.toList());
        log.info(userManualList.toString());
        return userManualList;
    }

}
