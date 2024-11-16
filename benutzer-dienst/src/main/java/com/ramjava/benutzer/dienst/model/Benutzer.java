package com.ramjava.benutzer.dienst.model;

import com.ramjava.benachrichtigung.service.model.Benachrichtigungen;
import com.ramjava.post.dienst.model.Posts;

public class Benutzer {

    private String userId;
    private String username;
    private String userPhoneNumber;
    private Posts posts;
    private Benachrichtigungen benachrichtigungen;

    public Posts getPosts() {
        return posts;
    }

    public void setPosts(Posts posts) {
        this.posts = posts;
    }

    public Benachrichtigungen getBenachrichtigungen() {
        return benachrichtigungen;
    }

    public void setBenachrichtigungen(Benachrichtigungen benachrichtigungen) {
        this.benachrichtigungen = benachrichtigungen;
    }

    public Benutzer() {
    }

    public Benutzer(String userId, String username, String userPhoneNumber) {
        this.userId = userId;
        this.username = username;
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }
}
