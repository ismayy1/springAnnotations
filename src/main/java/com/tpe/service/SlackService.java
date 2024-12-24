package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("slack_service") // if the parameter is given, the name of Bean changes
public class SlackService implements MessageService {

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
}
