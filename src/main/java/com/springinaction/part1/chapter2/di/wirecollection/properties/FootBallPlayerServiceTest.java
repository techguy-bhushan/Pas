package com.springinaction.part1.chapter2.di.wirecollection.properties;

import com.springinaction.part1.chapter2.di.wirecollection.commonservice.PlayerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FootBallPlayerServiceTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/main/java/com/springinaction/part1/chapter2/di/wirecollection/properties/application_context.xml");

        PlayerService playerService = applicationContext.getBean("footBallPlayerService", FootBallPlayerService.class);
        playerService.displayName();
    }
}
