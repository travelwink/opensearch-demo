package com.travelwink.opensearch_demo.opensearch.repository;

import com.travelwink.opensearch_demo.opensearch.entity.UserManual;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserManualRepository extends ElasticsearchRepository<UserManual, String> {
    List<UserManual> findByText(String keyword);
}
