package com.playwithspring.part1.chapter2.spel.xml;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppBase {
    private List<String> envs = Arrays.asList("dev", "prod", "qa");
    private List<String> availablePort = Arrays.asList("8080","5555","6369");

    public List<String> getEnvs() {
        return envs;
    }

    public List<String> getAvailablePort() {
        return availablePort;
    }

    public List<String> getEnvsInUpperCase(){
        return envs.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
}
