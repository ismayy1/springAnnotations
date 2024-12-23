package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.Repository;

public class WhatsAppService implements MessageService {

    private Repository repository;

    public WhatsAppService(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void sendMessage(Message message) {
        System.out.println("Your message is being sent via WhatsApp. Message: " + message.getBody());
    }

    @Override
    public void saveMessage(Message message) {

    }
}
