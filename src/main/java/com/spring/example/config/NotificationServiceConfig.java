package com.spring.example.config;

import com.spring.example.data.Data;
import com.spring.example.sendler.Sender;
import com.spring.example.sendler.impl.EmailSender;
import com.spring.example.sendler.impl.PushSender;
import com.spring.example.sendler.impl.SmsSender;
import com.spring.example.service.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationServiceConfig {

    @Bean("emailSender")
    public Sender<Data> createEmailSender() {
        return new EmailSender();
    }

    @Bean("smsSender")
    public Sender<Data> createSmsSender() {
        return new SmsSender();
    }

    @Bean("pushSender")
    public Sender<Data> createPushSender() {
        return new PushSender();
    }

    @Bean("notificationService")
    public NotificationService createNotificationService(@Qualifier("emailSender") Sender<Data> emailSender,
                                                         @Qualifier("smsSender") Sender<Data> smsSender,
                                                         @Qualifier("pushSender") Sender<Data> pushSender) {
        NotificationService notificationService = new NotificationService(emailSender, smsSender);
        notificationService.setPushSender(pushSender);
        return notificationService;
    }
}
