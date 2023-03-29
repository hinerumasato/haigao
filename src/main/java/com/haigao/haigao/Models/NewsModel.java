package com.haigao.haigao.Models;

public class NewsModel {
    private int id;
    private String title;
    private String content;
    private int userID;

    public NewsModel(String title, String content, int userID) {
        this.title = title;
        this.content = content;
        this.userID = userID;
    }

    public NewsModel(int id, String title, String content, int userID) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.userID = userID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
        
}
