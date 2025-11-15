package com.example.bcsd.Controller;

import com.example.bcsd.Model.Article;
import org.springframework.http.ResponseEntity;

@org.springframework.stereotype.Service
public class Service {
    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public ResponseEntity<Article> getArticles(String id) {
        return repository.getArticles(id);
    }
}
