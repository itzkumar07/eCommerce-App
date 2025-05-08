package com.bootcoding.eCommerce_App.repository;

import com.bootcoding.eCommerce_App.model.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, String> {
}