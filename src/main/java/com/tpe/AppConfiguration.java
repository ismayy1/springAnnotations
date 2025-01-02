package com.tpe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.Properties;
import java.util.Random;

@Configuration  // we'll do configurations in this class
@ComponentScan("com.tpe")   // scans all components in the given path. It'll look for the @Component annotations
// by default, ComponentScan annotation takes the location of the class it's used in.
// So, com.tpe in this case, would be the default path
@PropertySource("classpath:application.properties")
public class AppConfiguration {

    @Autowired
    private Environment environment;
    // Environment -> An interface from Spring, can be injected without creating a bean,
    // has some methods that allow us to access properties inside the PropertySource,
    // and also the entire Runtime Environment.

    @Bean   // We use BEan annotation to create beans from third party classes
    public Random random() {
        return new Random();
    }

//    What we can do with @Value annotation, we can also do with Environment object and Properties class.
    @Bean
    public Properties properties() {
        Properties properties = new Properties(); // KV pairs
        properties.put("myMail", environment.getProperty("email"));
        properties.put("myPhone", environment.getProperty("phoneNumber"));
        return properties;
    }
}
