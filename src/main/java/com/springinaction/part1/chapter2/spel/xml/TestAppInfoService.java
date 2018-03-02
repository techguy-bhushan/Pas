package com.springinaction.part1.chapter2.spel.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAppInfoService {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/main/java/com/springinaction/part1/chapter2/spel/xml/application_context.xml");
        AppInfoService appInfoService = applicationContext.getBean("appInfoService", AppInfoService.class);
        appInfoService.displayProperty();
        applicationContext.close();
    }
}
