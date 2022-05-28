package com.spring.example.sendler.impl;

import com.spring.example.data.Data;
import com.spring.example.sendler.Sender;

public class PushSender implements Sender<Data> {

    @Override
    public void send(Data data) {
        System.out.println(String.format("Отправка данных %s по Push", data));
    }
}
