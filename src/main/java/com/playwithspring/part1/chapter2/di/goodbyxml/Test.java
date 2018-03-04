package com.playwithspring.part1.chapter2.di.goodbyxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                 new AnnotationConfigApplicationContext(Config.class);

        AccountService accountService = annotationConfigApplicationContext.getBean("accountService", AccountService.class);
        accountService.processAccount();
        annotationConfigApplicationContext.close();
    }
}
