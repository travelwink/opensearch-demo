package com.travelwink.opensearch_demo.opensearch.repository;

import com.travelwink.opensearch_demo.opensearch.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.math.BigDecimal;
import java.util.List;

public interface MarketplaceRepository  extends ElasticsearchRepository<Product, String> {

    List<Product> findByNameLikeAndPriceGreaterThan(String name, BigDecimal price);
}
