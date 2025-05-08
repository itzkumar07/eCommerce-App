package com.bootcoding.eCommerce_App.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document(collection = "order")
public class Order {
    @Id
    private String id;
    private String customerName;
    private List<String> productIds;
    private double totalAmount;
    private Date orderDate;
}
