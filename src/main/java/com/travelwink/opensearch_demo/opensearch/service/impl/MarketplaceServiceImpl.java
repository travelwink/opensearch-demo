package com.travelwink.opensearch_demo.opensearch.service.impl;

import com.travelwink.opensearch_demo.opensearch.entity.Product;
import com.travelwink.opensearch_demo.opensearch.repository.MarketplaceRepository;
import com.travelwink.opensearch_demo.opensearch.service.MarketplaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketplaceServiceImpl implements MarketplaceService {
    @Autowired
    private MarketplaceRepository repository;


    @Override
    public List<Product> search(String keyword) {
        return List.of();
    }

    @Override
    public Product saveProduct(Product product) {
        return null;
    }
}
