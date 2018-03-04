package com.playwithspring.part1.chapter2.di.compitation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJuggler {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/main/java/com/playwithspring/part1/chapter2/di/compitation/application_context.xml");
       Juggler juggler = applicationContext.getBean("juggler", Juggler.class);
       juggler.perform();
       applicationContext.close();

    }
}
