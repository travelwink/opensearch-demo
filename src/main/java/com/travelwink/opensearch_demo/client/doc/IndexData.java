package com.travelwink.opensearch_demo.client.doc;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IndexData {
    private String title;
    private String text;
}
