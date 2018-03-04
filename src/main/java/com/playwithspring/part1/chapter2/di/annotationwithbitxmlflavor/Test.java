package com.playwithspring.part1.chapter2.di.annotationwithbitxmlflavor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/main/java/com/playwithspring/part1/chapter2/di/annotationwithbitxmlflavor/application_context.xml");

        Instructor instructor = (Instructor)applicationContext.getBean("springInstructor");
        instructor.getMyDayWork();

        instructor = (Instructor)applicationContext.getBean("hibernateInstructor");
        instructor.getMyDayWork();

        applicationContext.close();
    }
}
