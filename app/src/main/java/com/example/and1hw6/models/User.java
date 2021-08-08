package com.example.and1hw6.models;

public class User {
    private String date;
    private String comm;
    private int img;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public User(String date, String comm, int img) {
        this.date = date;
        this.comm = comm;
        this.img = img;
    }
}
