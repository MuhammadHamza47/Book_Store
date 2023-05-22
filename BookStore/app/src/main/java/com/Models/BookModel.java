package com.Models;

public class BookModel {
    int images1;
    String text;

    public int getImages1() {
        return images1;
    }

    public void setImages1(int images1) {
        this.images1 = images1;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public BookModel(int images1, String text) {
        this.images1 = images1;
        this.text = text;
    }
}
