package com.playwithspring.part1.chapter4.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.concurrent.atomic.AtomicLong;

@Aspect
public class ServiceAnalytics {
AtomicLong atomicLong = new AtomicLong(1);
    @Before("com.playwithspring.part1.chapter4.aop.annotation.Expression.expression()")
    public void syncLog() {
        System.out.println("total number of call in service=========="+atomicLong.getAndAdd(1));
    }


}
