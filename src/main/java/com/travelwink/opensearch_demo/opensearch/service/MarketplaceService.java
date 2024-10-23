package com.travelwink.opensearch_demo.opensearch.service;

import com.travelwink.opensearch_demo.opensearch.entity.Product;

import java.util.List;

public interface MarketplaceService {

    List<Product> search(String keyword);

    Product saveProduct(Product product);
}
