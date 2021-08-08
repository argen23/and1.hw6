package com.example.and1hw6.models;

public class Other {
    private String name;
    private String time;
    private int ava;
    private int photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getAva() {
        return ava;
    }

    public void setAva(int ava) {
        this.ava = ava;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public Other(String name, String time, int ava, int photo) {
        this.name = name;
        this.time = time;
        this.ava = ava;
        this.photo = photo;
    }
}
