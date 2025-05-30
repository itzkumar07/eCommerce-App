package com.bootcoding.eCommerce_App.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "category")
public class Category {
    @Id
    private String id;
    private String name;
    private String description;
}
