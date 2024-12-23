package com.tpe.repository;

import com.tpe.domain.Message;

public class DBRepository implements Repository {
    @Override
    public void save(Message message) {
        System.out.println("Saving message: " + message.getBody());
    }
}
