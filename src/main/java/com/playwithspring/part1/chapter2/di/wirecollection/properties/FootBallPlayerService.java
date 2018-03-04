package com.playwithspring.part1.chapter2.di.wirecollection.properties;

import com.playwithspring.part1.chapter2.di.wirecollection.commonservice.PlayerService;

import java.util.Map;
import java.util.Properties;

public class FootBallPlayerService  implements PlayerService {

    private Properties properties;
    public FootBallPlayerService(Properties  properties) {
        this.properties = properties;
    }

    public void displayName() {
        for (Map.Entry entry:properties.entrySet()) {
            System.out.println("Name Key :" + entry.getKey() + ", Name: "+ entry.getValue());
        }
    }
}
