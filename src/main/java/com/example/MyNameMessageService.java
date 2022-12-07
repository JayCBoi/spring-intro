package com.example;

import org.springframework.stereotype.Component;

public class MyNameMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "Piotr Zbinski";
    }
}