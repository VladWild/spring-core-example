package com.spring.example;

import com.spring.example.data.Data;
import com.spring.example.service.NotificationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassPathXmlApplicationContextStarter {

    private static final String PATH_XML = "context.xml";

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(PATH_XML);
        NotificationService notificationService = (NotificationService) context.getBean("notificationService");
        notificationService.sendDataAllSenders(new Data("Привет!"));
    }
}
