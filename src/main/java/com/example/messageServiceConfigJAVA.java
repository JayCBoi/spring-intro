package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class messageServiceConfigJAVA {

    @Bean("messageService")
    public MessageService messageService(){
        return new MyNameMessageService();
    }

    @Bean("randomTextMessageService")
    @Scope("prototype")
    public MessageService randomMessageService(){
        return new RandomTextMessageService();
    }
}