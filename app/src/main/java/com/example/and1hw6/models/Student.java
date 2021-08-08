package com.example.and1hw6.models;

public class Student {
    private int photo1;
    private int photo2;
    private int photo3;

    public int getPhoto1() {
        return photo1;
    }

    public void setPhoto1(int photo1) {
        this.photo1 = photo1;
    }

    public int getPhoto2() {
        return photo2;
    }

    public void setPhoto2(int photo2) {
        this.photo2 = photo2;
    }

    public int getPhoto3() {
        return photo3;
    }

    public void setPhoto3(int photo3) {
        this.photo3 = photo3;
    }



    public Student(int photo1, int photo2, int photo3) {
        this.photo1 = photo1;
        this.photo2 = photo2;
        this.photo3 = photo3;

    }
}
