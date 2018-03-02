package com.springinaction.part1.chapter2.di.wirecollection.set;

import com.springinaction.part1.chapter2.di.wirecollection.commonservice.FortuneService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Set;

public class ChessPlayerServiceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/main/java/com/springinaction/part1/chapter2/di/wirecollection/set/application_context.xml");
        ChessPlayerService chessPlayerService = applicationContext.getBean("chessPlayerService", ChessPlayerService.class);
        chessPlayerService.displayName();

        Set<FortuneService> fortuneServices = chessPlayerService.getFortuneServices();
        System.out.println("\n");
        System.out.println("Display fortunes....");
        for(FortuneService fortuneService : fortuneServices) {
            fortuneService.displayMyFortune();
        }
        applicationContext.close();
    }
}
