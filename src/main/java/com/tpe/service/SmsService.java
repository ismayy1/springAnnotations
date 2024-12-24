package com.tpe.service;

import com.tpe.domain.Message;
import org.springframework.stereotype.Component;

@Component
public class SmsService implements MessageService {
    @Override
    public void sendMessage(Message message) {
        System.out.println("Your message is being sent via SMS. Message: " + message.getBody());
    }

    @Override
    public void saveMessage(Message message) {

    }
}
