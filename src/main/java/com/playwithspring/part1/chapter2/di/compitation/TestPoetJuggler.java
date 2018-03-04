package com.playwithspring.part1.chapter2.di.compitation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPoetJuggler  {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/main/java/com/playwithspring/part1/chapter2/di/compitation/application_context.xml");

        PoetJuggler poetJuggler = applicationContext.getBean("poetJuggler", PoetJuggler.class);
        poetJuggler.perform();

        PoetJuggler poetJugglerWithParentJugglerBean = applicationContext.getBean("poetJugglerWithParentJugglerBean", PoetJuggler.class);
        poetJugglerWithParentJugglerBean.perform();

    }
}
