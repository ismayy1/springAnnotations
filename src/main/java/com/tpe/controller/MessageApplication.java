package com.tpe.controller;

import com.tpe.domain.Message;
import com.tpe.repository.DBRepository;
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

//        This is the dependency
        Repository repository = new DBRepository();   // 1 obj and we can use it in multiple classes anywhere anytime we need it

        MessageService messageService = new MailService(repository);
        messageService.sendMessage(message);
        messageService.sendMessage(message);

        MessageService messageService2 = new WhatsAppService(repository);
        messageService2.sendMessage(message);
        messageService2.sendMessage(message);
    }
}
