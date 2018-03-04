package com.springinaction.part1.chapter4.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
public class Logging {
    @Before("com.springinaction.part1.chapter4.aop.annotation.Expression.expression()")
    public void before() {
        System.out.println("Before target method execute....");
    }

    @AfterReturning("com.springinaction.part1.chapter4.aop.annotation.Expression.expression()")
    public void afterReturning() {

    }

    @AfterThrowing(value = "com.springinaction.part1.chapter4.aop.annotation.Expression.expression()" ,throwing = "throwing")
    public void afterThrowing(Throwable throwing) {
        System.out.println("tracking exception: message:" + throwing.getMessage());
    }

    @Around("com.springinaction.part1.chapter4.aop.annotation.Expression.expression()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String method = ((MethodSignature) proceedingJoinPoint.getSignature()).getName();
        System.out.println("Around before proceed....method:"+method);
        proceedingJoinPoint.proceed();
        System.out.println("Around.. after proceed....");
    }

    @After("com.springinaction.part1.chapter4.aop.annotation.Expression.expression()")
    public void after() {
        System.out.println("After target method execute....");
    }
}
