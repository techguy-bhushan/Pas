package com.springinaction.part1.chapter2.di.wirecollection.list;

import com.springinaction.part1.chapter2.di.wirecollection.commonservice.FortuneService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestCricketPlayerService {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/main/java/com/springinaction/part1/chapter2/di/wirecollection/list/application_context.xml");
        CricketPlayerService cricketPlayerService = applicationContext.getBean("cricketPlayerService", CricketPlayerService.class);
        cricketPlayerService.displayName();

        List<FortuneService> fortuneServices = cricketPlayerService.getFortuneServices();
        System.out.println("\n");
        System.out.println("Display fortunes....");
        for(FortuneService fortuneService : fortuneServices) {
            fortuneService.displayMyFortune();
        }
        applicationContext.close();
    }
}
