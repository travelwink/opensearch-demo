package com.travelwink.opensearch_demo.opensearch.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@Accessors(chain = true)
@Document(indexName = "user-manual")
@Setting(replicas = 0)
public class UserManual implements Serializable {

    @Id
    @Field(name = "id", type = FieldType.Keyword)
    private String id;

    @Field(name = "material_code", type = FieldType.Keyword)
    @JsonProperty(value = "materialCode")
    private List<String> materialCode;

    @Field(name = "vehicle_model", type = FieldType.Keyword)
    @JsonProperty(value = "vehicleModel")
    private List<String> vehicleModel;

    @Field(name = "title", type = FieldType.Text, analyzer = "ik_max_word")
    private String title;

    @Field(name = "root", type = FieldType.Keyword)
    private String root;

    @Field(name = "text", type = FieldType.Text, analyzer = "ik_max_word")
    private String text;

    @Field(name = "href", type = FieldType.Keyword)
    private String href;

    @Field(name = "lang", type = FieldType.Keyword)
    private String lang;

}
