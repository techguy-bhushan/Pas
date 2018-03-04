package com.springinaction.part1.chapter4.aop.xml.intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIntroduction {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/main/java/com/springinaction/part1/chapter4/aop/xml/intro/application_context.xml");
        Thinker thinker = (Thinker)applicationContext.getBean("volunteer");
        thinker.thinkOfSomething("Justin Bieber");
        ((Comment) thinker).makeSomeCommentOnThought();

    }
}
