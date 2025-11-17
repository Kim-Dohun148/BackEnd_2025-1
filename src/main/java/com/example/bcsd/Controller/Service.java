package com.example.bcsd.Controller;

import com.example.bcsd.Model.Article;
import com.example.bcsd.Model.Member;
import org.springframework.http.ResponseEntity;

import java.util.Collection;

@org.springframework.stereotype.Service
public class Service {
    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public Collection<Article> getAllArticles() {
        return repository.getAllArticles();
    }

    public Collection<Member> getAllBoards() {
        return repository.getAllMembers();
    }

    public ResponseEntity<Article> getArticles(String id) {
        return repository.getArticles(id);
    }

    public void setArticles(String id, Article article) {
        repository.setArticles(id, article);
    }

    public void putArticles(String id, Article article) {
        repository.putArticles(id, article);
    }

    public void deleteArticles(String id) {
        repository.deleteArticles(id);
    }
}
