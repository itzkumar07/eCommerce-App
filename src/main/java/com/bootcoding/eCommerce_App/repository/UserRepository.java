package com.bootcoding.eCommerce_App.repository;

import com.bootcoding.eCommerce_App.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
    User findByEmail(String email);
}
