package com.spring.example.sendler.impl;

import com.spring.example.data.Data;
import com.spring.example.sendler.Sender;

public class EmailSender implements Sender<Data> {

    @Override
    public void send(Data data) {
        System.out.printf("Отправка данных %s по Email%n", data);
    }
}
