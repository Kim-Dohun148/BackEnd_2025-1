package com.example.bcsd.Model;

public class Article {
    private int id;
    private int writerId;
    private int boardId;
    private String title;
    private String content;
    private String writerDate;
    private String reviseDate;

    public Article(
            int id,
            int writerId,
            int boardId,
            String title,
            String content,
            String writerDate,
            String reviseDate) {
        this.id = id;
        this.writerId = writerId;
        this.boardId = boardId;
        this.title = title;
        this.content = content;
        this.writerDate = writerDate;
        this.reviseDate = reviseDate;
    }

    public int getId() {
        return id;
    }

    public int getWriterId() {
        return writerId;
    }
    public int getBoardId() {
        return boardId;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getWriterDate() {
        return writerDate;
    }

    public String getReviseDate() {
        return reviseDate;
    }
}
