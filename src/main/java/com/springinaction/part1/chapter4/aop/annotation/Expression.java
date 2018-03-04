package com.springinaction.part1.chapter4.aop.annotation;

import org.aspectj.lang.annotation.Pointcut;

public class Expression {

    @Pointcut("execution(* *.*(..)) && within(com.springinaction.part1.chapter4.aop.annotation.*)")
    public void expression() { }

}
