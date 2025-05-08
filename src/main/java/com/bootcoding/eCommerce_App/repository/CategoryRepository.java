package com.bootcoding.eCommerce_App.repository;

import com.bootcoding.eCommerce_App.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> {
}