package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  // When used, objects of this class will be created and managed by Spring.
// Those objects will be called Spring Beans.
//@Scope("singleton") // DEFAULT
@Scope("prototype") // can be useful when testing
public class SmsService implements MessageService {

//    FIELD INJECTION
//    @Autowired  // Automatic dependency injection
//    @Qualifier("fileRepository")    // if there're multiple beans of a type, qualifies.selects the one in the parameter
//    private Repository repository;  // Spring says there're two available beans, so we used @Qualifier

//    SETTER INJECTION
    private Repository repository;
    @Autowired
    @Qualifier("fileRepository")
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

//    CONSTRUCTOR INJECTION
//    private Repository repository;
//    @Autowired
//    public SmsService(@Qualifier("fileRepository") Repository repository) {
//        this.repository = repository;
//    }

    @Override
    public void sendMessage(Message message) {
        System.out.println("Your message is being sent via SMS. Message: " + message.getBody());
    }

    @Override
    public void saveMessage(Message message) {
//        We shouldn't create a repo obj here
        repository.save(message);
    }
}
