package com.travelwink.opensearch_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication(exclude = {ElasticsearchDataAutoConfiguration.class})
@EnableElasticsearchRepositories(basePackages = {"com.travelwink.opensearch_demo.opensearch.repository"})
public class OpenSearchDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenSearchDemoApplication.class, args);
	}

}
