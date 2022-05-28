package com.spring.example.service;

import com.spring.example.data.Data;
import com.spring.example.sendler.Sender;

public class NotificationService {

    private final Sender<Data> emailSender;
    private final Sender<Data> smsSender;

    private Sender<Data> pushSender;

    public NotificationService(Sender<Data> emailSender,
                               Sender<Data> smsSender) {
        this.emailSender = emailSender;
        this.smsSender = smsSender;
    }

    public void setPushSender(Sender<Data> pushSender) {
        this.pushSender = pushSender;
    }

    public void sendDataAllSenders(Data data) {
        emailSender.send(data);
        smsSender.send(data);
        pushSender.send(data);
    }
}

