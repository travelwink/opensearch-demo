package com.travelwink.opensearch_demo.opensearch.controller;

import com.travelwink.opensearch_demo.opensearch.entity.Product;
import com.travelwink.opensearch_demo.opensearch.repository.MarketplaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/marketplace")
public class MarketplaceRestController {

    @Autowired
    private MarketplaceRepository repository;

    @GetMapping(value = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> search(
            @RequestParam(value = "name", required = false, defaultValue = "") String name,
            @RequestParam(value = "price", required = false, defaultValue = "0.0") BigDecimal price) {
        return repository.findByNameLikeAndPriceGreaterThan(name, price);
    }
}
