package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Properties;
import java.util.Random;

@Component("slack_service") // if the parameter is given, the name of Bean changes
public class SlackService implements MessageService {

    @Autowired
    private Properties properties;

    private Repository repository;

    @Autowired
    private Random random;

    @Override
    public void sendMessage(Message message) {
        System.out.println("Your message is being sent via Slack. Message: " + message.getBody());
    }

    @Override
    public void saveMessage(Message message) {
//        repository.save(message);
        System.out.println(random.nextInt());
    }


//    =============

    @Value("${email}")
    private String email;
    @Value("${phoneNumber}")
    private String phone;

public void printContacts() {
    System.out.println("E-mail: " + this.email);
    System.out.println("Phone: " + this.phone);
}
//    =============

    public void getContacts() {
        System.out.println("E-mail: " + properties.getProperty("myMail"));
        System.out.println("Phone: " + properties.getProperty("myPhone"));
    }
}
