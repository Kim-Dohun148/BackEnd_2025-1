package com.example.bcsd;


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
    public void setId(int id) {
        this.id = id;
    }

    public int getWriterId() {
        return writerId;
    }
    public void setWriterId(int writerId) {
        this.writerId = writerId;
    }

    public int getBoardId() {
        return boardId;
    }
    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public String getWriterDate() {
        return writerDate;
    }
    public void setWriterDate(String writerDate) {
        this.writerDate = writerDate;
    }

    public String getReviseDate() {
        return reviseDate;
    }
    public void setReviseDate(String reviseDate) {
        this.reviseDate = reviseDate;
    }
}
