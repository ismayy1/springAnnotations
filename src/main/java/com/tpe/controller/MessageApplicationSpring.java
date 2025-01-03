package com.tpe.controller;

import com.tpe.AppConfiguration;
import com.tpe.domain.Message;
import com.tpe.repository.DBRepository;
import com.tpe.repository.Repository;
import com.tpe.service.MessageService;
import com.tpe.service.SlackService;
import com.tpe.service.SmsService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;

public class MessageApplicationSpring {
    public static void main(String[] args) {

        Message message = new Message();
        message.setBody("Welcome to the amazing world of Spring!");

//        Reads the annotation in the config class, then scans components & beans,
//        creates a Spring Bean from each one of them, then leaves them into the context
//        When user demands a Bean, injects the dependency into the bean then sends it.
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        MessageService service1 = context.getBean(SmsService.class); // we didn't use "new" keyword
        service1.sendMessage(message);

        /*
        MessageService service2 = context.getBean(SlackService.class);
        service2.sendMessage(message);
         */

        MessageService service3 = context.getBean("smsService", MessageService.class);
        service3.sendMessage(message);


        /*
        MessageService service4 = context.getBean("slack_service", MessageService.class);
        // "slackService" class name with camelcase, there're two beans of MessageService, we specify which one we want to use
        service4.sendMessage(message);
        service4.saveMessage(message);
         */


//        MessageService service4 = context.getBean("smsService", MessageService.class);
//        service4.saveMessage(message);
//        We didn't use the new keyword
//        Service depends on repo, but we didn't inject it ourselves. Thanks to Spring

        /*
//        Setter injection vs Constructor injection, safety thing.
        SmsService service5 = context.getBean(SmsService.class);
        service5.saveMessage(message);  // Injection done by Spring, fileRepository

        Repository repository = context.getBean(DBRepository.class);
        service5.setRepository(repository);
        service5.saveMessage(message);
         */

////        Random random = new Random();
//        Random random = context.getBean(Random.class);
//        System.out.println(random.nextInt(100));

        MessageService service6 = context.getBean(SmsService.class);
        MessageService service7 = context.getBean(SmsService.class);

//        if (service6 == service7) {
//            System.out.println("They're the same obj");
//            System.out.println(service6);
//            System.out.println(service7);
//        } else {
//            System.out.println("They're different SMS service obj");
//            System.out.println(service6);
//            System.out.println(service7);
//        }

//        Bean Scope
//        1. Singleton -> (Default Scope): only 1 Bean of obj will be created and used
//        2. Prototype -> Everytime we want to get a Bean, a new Bean will be created.
//                        Spring won't remove these Beans, we'll need to remove them ourselves

        System.out.println("============================================");
        SlackService service8 = context.getBean(SlackService.class);
        service8.printContacts();
        System.out.println("============================================");

//        System.out.println("============================================");
//        SlackService service8 = context.getBean(SlackService.class);
//        service8.printContacts();
//        System.out.println("============================================");

        context.close();
        System.out.println("Context is closed!");
//        context.getBean(SmsService.class);
//        We can't get a Bean after closing the context
    }
}
