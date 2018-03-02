package com.springinaction.part1.chapter2.di.wirecollection.commonservice;

import java.util.Random;

public class DayFortuneService implements FortuneService {
    private String[] dayFortunes = { "Greate Day", "Bad Day", "It's Ok"};
    public void displayMyFortune() {
        System.out.println(dayFortunes[new Random().nextInt(dayFortunes.length - 1)]);
    }
}
