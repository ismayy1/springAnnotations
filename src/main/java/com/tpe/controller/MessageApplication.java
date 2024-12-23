package com.tpe.controller;

import com.tpe.domain.Message;
import com.tpe.service.MailService;

public class MessageApplication {
    public static void main(String[] args) {

        Message message = new Message();
        message.setBody("Let's learn spring together!");

        MailService mailService = new MailService();
        mailService.sendMessage(message);
    }
}
