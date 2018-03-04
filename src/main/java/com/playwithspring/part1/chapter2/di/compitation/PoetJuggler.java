package com.playwithspring.part1.chapter2.di.compitation;

import com.playwithspring.part1.commons.Poem;

public class PoetJuggler extends Juggler {
    private Poem poem;
    public PoetJuggler(Poem poem) {
        this.poem = poem;
    }

    public PoetJuggler(int beanBags, Poem poem) {
        System.out.println("PoetJuggler created with arg constructor");
        this.poem = poem;
        this.beanBags = beanBags;
    }

    @Override
    public void perform() {
        super.perform();
        System.out.println("While reciting...........");
        poem.recite();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After PoetJuggler creating, calling by InitializingBean.....");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("PoetJuggler is destroy by context, calling by DisposableBean.....");
    }
}
