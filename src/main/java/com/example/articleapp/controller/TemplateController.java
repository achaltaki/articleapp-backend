package com.example.articleapp.controller;

import com.example.articleapp.model.Template;
import com.example.articleapp.repository.TemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/templates")
public class TemplateController {

    @Autowired
    private TemplateRepository templateRepository;

    @PostMapping
    public Template createTemplate(@RequestBody Template template) {
        return templateRepository.save(template);
    }

    @GetMapping
    public List<Template> getAllTemplates() {
        return templateRepository.findAll();
    }
}