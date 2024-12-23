package com.tpe.controller;

import com.tpe.domain.Message;
import com.tpe.repository.FileRepository;
import com.tpe.repository.Repository;
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

        Repository repository = new FileRepository();

        MessageService messageService = new MailService(repository);
        messageService.sendMessage(message);
        messageService.sendMessage(message);

        MessageService messageService2 = new WhatsAppService(repository);
        messageService2.sendMessage(message);
        messageService2.sendMessage(message);
    }
}
