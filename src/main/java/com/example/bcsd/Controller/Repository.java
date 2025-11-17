package com.example.bcsd.Controller;

import ch.qos.logback.core.model.Model;
import com.example.bcsd.Model.Article;
import com.example.bcsd.Model.Board;
import com.example.bcsd.Model.Member;
import jakarta.annotation.PostConstruct;
import org.springframework.http.ResponseEntity;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
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
        articleMap.put("2", new Article(
                2,
                2,
                2,
                "제목2",
                "내용2",
                "2025/11/16",
                ""
        ));

        boardMap = new HashMap<String, Board>();
        boardMap.put("1", new Board(1, "자유게시판"));

        memberMap = new HashMap<String, Member>();
        memberMap.put("1", new Member(1, "회원1", "이메일", "비밀번호"));
    }

    public Collection<Article> getAllArticles() {
        return articleMap.values();
    }

    public Collection<Board> getAllboards() {
        return boardMap.values();
    }

    public Collection<Member> getAllMembers() {
        return memberMap.values();
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

    public void putArticles(String id, Article article) {
        articleMap.get(id).setId(article.getId());
        articleMap.get(id).setWriterId(article.getWriterId());
        articleMap.get(id).setBoardId(article.getBoardId());
        articleMap.get(id).setTitle(article.getTitle());
        articleMap.get(id).setContent(article.getContent());
        articleMap.get(id).setWriterDate(article.getWriterDate());
        articleMap.get(id).setReviseDate(article.getReviseDate());
    }

    public void deleteArticles(String id) {
        articleMap.remove(id);
    }
}
