package com.springinaction.part1.chapter2.spel.xml;

import java.util.List;

public class AppInfoService {

    private List<String> envInUpperCase;
    private String port;
    private String host;
    private String randomPort;
    private boolean isProduction;
    private int min;
    private int max;

    public void displayProperty() {
        System.out.println("envInUpperCase:"+envInUpperCase);
        System.out.println("port:"+port);
        System.out.println("host:"+host);
        System.out.println("randomPort:"+randomPort);
        System.out.println("isProduction:"+isProduction);
        System.out.println("min:"+min);
        System.out.println("max:"+max);
    }
    public void setEnvInUpperCase(List<String> envInUpperCase) {
        this.envInUpperCase = envInUpperCase;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setRandomPort(String randomPort) {
        this.randomPort = randomPort;
    }

    public void setProduction(boolean production) {
        isProduction = production;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }


}
