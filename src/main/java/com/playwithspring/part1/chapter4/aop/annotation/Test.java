package com.playwithspring.part1.chapter4.aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/main/java/com/playwithspring/part1/chapter4/aop/annotation/application_context.xml");

        UserService userService = applicationContext.getBean("userService",UserService.class);
        userService.getUser(1);
    }
}
