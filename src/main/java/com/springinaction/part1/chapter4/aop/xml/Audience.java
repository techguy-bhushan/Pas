package com.springinaction.part1.chapter4.aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Date;

public class Audience {
    // Before performance
    public void takeSeats() {
        System.out.println("The audience is taking their seats.");
    }

    //Before performance
    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cellphones");
    }

    //After
    public void turnOnCellPhones() {
        System.out.println("The audience is turning on their cellphones");
    }

    //After performance successfully
    public void applaud() {
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    }

    //After bad performance
    public void demandRefund() {
        System.out.println("Boo! We want our money back!");
    }

    // Around
    public void watcher(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        long startTime = new Date().getTime();
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable t) {
            System.out.println("Bad performance ");
            throw new Exception(t);
        }

        long endPerformance = new Date().getTime();

        System.out.println("Performance took :"+ ((endPerformance - startTime)));

    }
}
