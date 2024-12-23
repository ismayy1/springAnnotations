package com.tpe.controller;

import com.tpe.domain.Message;
import com.tpe.service.MailService;
import com.tpe.service.MessageService;
import com.tpe.service.WhatsAppService;

public class MessageApplication {
    public static void main(String[] args) {

        Message message = new Message();
        message.setBody("Let's learn spring together!");

        /*
            MailService mailService = new MailService();
            mailService.sendMessage(message);
         */

        MessageService messageService = new WhatsAppService();
        messageService.sendMessage(message);
    }
}
