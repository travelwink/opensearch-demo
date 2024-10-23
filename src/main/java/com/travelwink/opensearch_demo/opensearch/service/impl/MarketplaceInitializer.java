package com.travelwink.opensearch_demo.opensearch.service.impl;

import com.travelwink.opensearch_demo.opensearch.entity.Product;
import com.travelwink.opensearch_demo.opensearch.repository.MarketplaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class MarketplaceInitializer {

    @Autowired
    private MarketplaceRepository repository;

    public void afterPropertiesSet() throws Exception {
        repository.save(new Product(
                "1",
                "Utopia Bedding Bed Pillows",
                new BigDecimal(39.99),
                2,
                "These professionally finished pillows, with high thread counts, provide great comfort against your skin along with added durability "
                        + "that easily resists wear and tear to ensure a finished look for your bedroom.",
                "Utopia Bedding"));

        repository.save(new Product(
                "2",
                "Echo Dot Smart speaker",
                new BigDecimal(34.99),
                10,
                "Our most popular smart speaker with a fabric design. It is our most compact smart speaker that fits perfectly into small spaces.",
                "Amazon"));
    }
}
