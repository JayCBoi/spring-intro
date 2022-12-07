package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
        MessageService messageService2 = applicationContext.getBean("messageService", MessageService.class);

        //hashCode() - Different if scope="prototype" / Same if scope="singleton"
        System.out.println(messageService.hashCode());
        System.out.println(messageService2.hashCode());

        System.out.println(messageService.getMessage());

        applicationContext.close();
    }
}
