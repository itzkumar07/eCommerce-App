package com.bootcoding.eCommerce_App.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "journalEntry")
public class JournalEntry {
    @Id
    private String id;
    private String entryType;
    private String description;
    private double amount;
    private Date entryDate;
}
