package com.playwithspring.part1.chapter4.aop.xml;

import com.playwithspring.part1.commons.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestKnifteJugglerWithAop {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/main/java/com/playwithspring/part1/chapter4/aop/xml/application_context.xml");
        Performer performer = (Performer)applicationContext.getBean("knifeJuggler");
        performer.perform();
    }
}