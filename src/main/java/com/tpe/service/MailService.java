package com.tpe.service;

import com.tpe.domain.Message;

public class MailService implements MessageService {

    @Override
    public void sendMessage(Message message) {
        System.out.println("Your message is being sent as email!");
    }

    @Override
    public void saveMessage(Message message) {

    }
}
