package com.example.bcsd.Controller;

import com.example.bcsd.Model.Article;
import com.example.bcsd.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/articles/{id}")
    public ResponseEntity<Article> getArticles(@PathVariable("id") String id) {
        return service.getArticles(id);
    }

    @PostMapping("/articles/{id}")
    public void setArticles(
            @PathVariable("id") String id,
            @RequestBody Article article) {
        service.setArticles(id, article);
    }

    @PutMapping("/user/{id}")
    public void putArticles(
            @PathVariable("id") String id,
            @RequestBody Article article) {

        service.putArticles(id, article);
    }
}
