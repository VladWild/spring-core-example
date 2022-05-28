package com.spring.example.sendler;

public interface Sender<T> {

    void send(T data);
}
