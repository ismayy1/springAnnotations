package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.DBRepository;
import com.tpe.repository.Repository;

public class MailService implements MessageService {

    private DBRepository dbRepository;

    public MailService(Repository repository) {

    }

    @Override
    public void sendMessage(Message message) {
        System.out.println("Your message is being sent as email!");
    }

    @Override
    public void saveMessage(Message message) {

//        DBRepository dbRepository = new DBRepository();   //Everytime we call this saveMessage method, a new Repo obj will be created
        dbRepository.save(message);
    }
}
