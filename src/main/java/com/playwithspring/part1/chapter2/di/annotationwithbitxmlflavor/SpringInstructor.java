package com.playwithspring.part1.chapter2.di.annotationwithbitxmlflavor;

import org.springframework.stereotype.Component;

@Component
public class SpringInstructor  implements Instructor {
    @Override
    public void getMyDayWork() {
        System.out.println("Hey go throw with di using annotationwithbitxmlflavor....");
    }
}
