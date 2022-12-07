package com.example;

import org.springframework.stereotype.Component;

@Component("messageServiceSecond")

public class RandomTextMessageService implements MessageService{

    private final String[] message = {"Witaj [0]", "Witaj [1]","Witaj [2]","Witaj [3]","Witaj [4]","Witaj [5]","Witaj [6]","Witaj [7]","Witaj [8]","Witaj [9]",};

    @Override
    public String getMessage() {
        return message[(int) (Math.random() * (9))];
    }
}
