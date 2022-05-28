package com.spring.example.data;

public class Data {
    private String text;

    public Data(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Data{" +
                "text='" + text + '\'' +
                '}';
    }
}
