package com.tpe.service;

import com.tpe.domain.Message;

public interface MessageService {

    public void sendMessage(Message message);
    void saveMessage(Message message);
}
