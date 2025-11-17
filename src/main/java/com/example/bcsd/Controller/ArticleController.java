package com.example.bcsd.Controller;

import org.springframework.ui.Model;

import com.example.bcsd.Model.Article;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@org.springframework.stereotype.Controller
public class ArticleController {
    private Service service;

    public ArticleController(Service service) {
        this.service = service;
    }

    @ResponseBody
    @GetMapping("/posts")
    public String getAllPosts(Model model) {
        model.addAttribute("articles", service.getAllArticles());
        model.addAttribute("Boards", service.getAllBoards());
        model.addAttribute("members", service.getAllMembers());

        return "posts";
    }

    @GetMapping("/articles")
    public Collection<Article> getAllArticles() {
        return service.getAllArticles();
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

    @PutMapping("/articles/{id}")
    public void putArticles(
            @PathVariable("id") String id,
            @RequestBody Article article) {

        service.putArticles(id, article);
    }

    @DeleteMapping("/articles/{id}")
    public void deleteArticles(@PathVariable("id") String id) {
        service.deleteArticles(id);
    }

}
