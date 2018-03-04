package com.playwithspring.part1.chapter4.aop.xml.intro;

public class Volunteer implements Thinker {
    private String thoughts;
    @Override
    public void thinkOfSomething(String thoughts) {
        this.thoughts=thoughts;
        System.out.println("I am thinking:"+thoughts);
    }

    public String getThoughts() {
        return thoughts;
    }
}
