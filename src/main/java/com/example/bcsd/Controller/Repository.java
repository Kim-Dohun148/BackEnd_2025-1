package com.example.bcsd.Controller;

import com.example.bcsd.Model.Article;
import com.example.bcsd.Model.Board;
import com.example.bcsd.Model.Member;
import jakarta.annotation.PostConstruct;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

@org.springframework.stereotype.Repository
public class Repository {
    private Map<String, Article> articleMap;
    private Map<String, Board> boardMap;
    private Map<String, Member> memberMap;

    @PostConstruct
    public void init() {
        articleMap = new HashMap<String, Article>();
        articleMap.put("1", new Article(
                1,
                1,
                1,
                "제목1",
                "내용1",
                "2025/11/15",
                ""
                ));
    }

    public ResponseEntity<Article> getArticles(String id) {
        Article article = articleMap.get(id);

        if (article == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(article);
    }

    public void setArticles(String id, Article article) {
        articleMap.put(id, article);
    }
}
