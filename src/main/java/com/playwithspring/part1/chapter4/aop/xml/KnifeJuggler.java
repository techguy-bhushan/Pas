package com.playwithspring.part1.chapter4.aop.xml;

import com.playwithspring.part1.commons.Performer;

public class KnifeJuggler implements Performer {

    private int knifes = 5;

    @Override
    public void perform() {

        System.out.println("JUGGLING " + knifes + " Knifes");
        //Enable below line, for test throwing exception
       // int k = 10/0;
    }

}