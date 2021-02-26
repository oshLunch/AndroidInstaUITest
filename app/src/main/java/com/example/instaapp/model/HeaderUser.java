package com.example.instaapp.model;

public class HeaderUser {
    private Integer id;
    private String username;
    private int imgRes;

    public HeaderUser(Integer id, String username, int imgRes) {
        this.id = id;
        this.username = username;
        this.imgRes = imgRes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    @Override
    public String toString() {
        return "HeaderUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", imgSrc=" + imgRes +
                '}';
    }
}
