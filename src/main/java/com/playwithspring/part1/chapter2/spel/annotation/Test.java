package com.playwithspring.part1.chapter2.spel.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.playwithspring.part1.chapter2.spel.annotation")
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Test.class);
        AppService appService = context.getBean("appService", AppService.class);
        appService.displayInfo();
        context.close();
    }
}
