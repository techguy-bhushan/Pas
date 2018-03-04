package com.playwithspring.part1.chapter2.di.wirecollection.map;

import com.playwithspring.part1.chapter2.di.wirecollection.commonservice.FortuneService;
import com.playwithspring.part1.chapter2.di.wirecollection.commonservice.PlayerService;

import java.util.Map;

public class VollyBallPlayerService implements PlayerService {
    private Map<Integer,String> playersNameMap;
    private Map<Integer, FortuneService>  fortuneServicesMap;

    public Map<Integer, String> getPlayersNameMap() {
        return playersNameMap;
    }

    public void setPlayersNameMap(Map<Integer, String> playersNameMap) {
        this.playersNameMap = playersNameMap;
    }

    public Map<Integer, FortuneService> getFortuneServicesMap() {
        return fortuneServicesMap;
    }

    public void setFortuneServicesMap(Map<Integer, FortuneService> fortuneServicesMap) {
        this.fortuneServicesMap = fortuneServicesMap;
    }

    public void displayName() {
        for (Map.Entry entry: playersNameMap.entrySet()) {
            System.out.println("Rank:" + entry.getKey() + " Name: "+ entry.getValue());
        }
    }
}
