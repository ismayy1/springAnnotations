package com.tpe.repository;

import com.tpe.domain.Message;
import org.springframework.stereotype.Component;

@Component
public class FileRepository implements Repository {
    @Override
    public void save(Message message) {
        System.out.println("Message is being saved into file: " + message.getBody());
    }
}
