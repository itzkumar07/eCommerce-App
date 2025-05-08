package com.bootcoding.eCommerce_App.repository;

import com.bootcoding.eCommerce_App.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
}
