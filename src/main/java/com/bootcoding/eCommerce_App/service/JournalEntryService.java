package com.bootcoding.eCommerce_App.service;

import com.bootcoding.eCommerce_App.model.JournalEntry;
import com.bootcoding.eCommerce_App.repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public List<JournalEntry> getAllEntries() {
        return journalEntryRepository.findAll();
    }

    public JournalEntry createEntry(JournalEntry entry) {
        return journalEntryRepository.save(entry);
    }

    public void deleteEntry(String id) {
        journalEntryRepository.deleteById(id);
    }
}