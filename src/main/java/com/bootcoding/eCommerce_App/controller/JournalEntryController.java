package com.bootcoding.eCommerce_App.controller;

import com.bootcoding.eCommerce_App.model.JournalEntry;
import com.bootcoding.eCommerce_App.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/journal-entries")
public class JournalEntryController {

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAllEntries() {
        return journalEntryService.getAllEntries();
    }

    @PostMapping("/")
    public JournalEntry createEntry(@RequestBody JournalEntry entry) {
        return journalEntryService.createEntry(entry);
    }

    @DeleteMapping("/{id}")
    public void deleteEntry(@PathVariable String id) {
        journalEntryService.deleteEntry(id);
    }
}
