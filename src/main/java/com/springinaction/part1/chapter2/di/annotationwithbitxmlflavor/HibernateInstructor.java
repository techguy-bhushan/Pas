package com.springinaction.part1.chapter2.di.annotationwithbitxmlflavor;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class HibernateInstructor implements Instructor {
    @Override
    public void getMyDayWork() {
        System.out.println("Hey lets do ORM with spring way...;)");
    }

    @PostConstruct
    public void init() {
        System.out.println("Init HibernateInstructor");
    }


    @PreDestroy
    public void destroy() {
        System.out.println("destroy HibernateInstructor");
    }
}
