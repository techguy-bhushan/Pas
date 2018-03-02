package com.springinaction.part1.chapter2.di.wirecollection.map;

import com.springinaction.part1.chapter2.di.wirecollection.commonservice.FortuneService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class TestVollyBallPlayerService {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/main/java/com/springinaction/part1/chapter2/di/wirecollection/map/application_context.xml");
        VollyBallPlayerService vollyBallPlayerService = applicationContext.getBean("vollyBallPlayerService", VollyBallPlayerService.class);
        vollyBallPlayerService.displayName();

        Map<Integer, FortuneService> fortuneServices = vollyBallPlayerService.getFortuneServicesMap();
        System.out.println("\n");
        System.out.println("Display fortunes....");
        for(Map.Entry<Integer, FortuneService> entry : fortuneServices.entrySet()) {
            FortuneService fortuneService = entry.getValue();
            fortuneService.displayMyFortune();
        }
        applicationContext.close();
    }
}
