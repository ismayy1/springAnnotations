package com.tpe;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  // we'll do configurations in this class
@ComponentScan("com.tpe")   // scans all components in the given path. It'll look for the @Component annotations
// by default, ComponentScan annotation takes the location of the class it's used in.
// So, com.tpe in this case, would be the default path
public class AppConfiguration {
}
