package com.tpe.service;

import com.tpe.domain.Message;

public class WhatsAppService implements MessageService {
    @Override
    public void sendMessage(Message message) {
        System.out.println("Your message is being sent via WhatsApp. Message: " + message.getBody());
    }

    @Override
    public void saveMessage(Message message) {

    }
}
