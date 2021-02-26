package com.example.instaapp.model;

public class Post {
    private int id;
    private String postUserName;
    private int imgRes;
    private Integer likedNum;

    public Post(int id, String postUserName, int imgRes, Integer likedNum) {
        this.id = id;
        this.postUserName = postUserName;
        this.imgRes = imgRes;
        this.likedNum = likedNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostUserName() {
        return postUserName;
    }

    public void setPostUserName(String postUserName) {
        this.postUserName = postUserName;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public Integer getLikedNum() {
        return likedNum;
    }

    public void setLikedNum(Integer likedNum) {
        this.likedNum = likedNum;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", postUserName='" + postUserName + '\'' +
                ", imgSrc=" + imgRes +
                ", likedNum=" + likedNum +
                '}';
    }
}
