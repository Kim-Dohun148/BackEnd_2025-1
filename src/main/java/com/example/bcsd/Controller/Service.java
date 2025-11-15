package com.example.bcsd.Controller;

import com.example.bcsd.Model.Article;
import org.springframework.http.ResponseEntity;

public class Service {
    private Repository repository;

    public ResponseEntity<Article> getArticles(String id) {
        return repository.getArticles(id);
    }
}
