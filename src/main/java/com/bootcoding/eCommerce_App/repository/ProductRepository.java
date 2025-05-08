package com.bootcoding.eCommerce_App.repository;

import com.bootcoding.eCommerce_App.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
