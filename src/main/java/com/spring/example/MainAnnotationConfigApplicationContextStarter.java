package com.spring.example;

import com.spring.example.config.NotificationServiceConfig;
import com.spring.example.data.Data;
import com.spring.example.service.NotificationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAnnotationConfigApplicationContextStarter {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(NotificationServiceConfig.class);
        NotificationService notificationService = (NotificationService) context.getBean("notificationService");
        notificationService.sendDataAllSenders(new Data("Привет!"));
    }
}
