package com.springinaction.part1.chapter2.di.compitation;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Juggler implements Performer/*,InitializingBean, DisposableBean*/ {
    int beanBags = 3;

    public Juggler() {
        System.out.println("Juggler created with default constructor");
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
        System.out.println("Juggler created with arg constructor");
    }

    public void perform() {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }

    // Will call by default-init-method defined in application context xml
    public void afterPropertiesSet() throws Exception {
        System.out.println("After Juggler creating, calling by InitializingBean.....");
    }

    // Will call by default-destroy-method defined in application context xml
    public void destroy() throws Exception {
        System.out.println("Juggler is destroy by context, calling by DisposableBean.....");
    }
}
