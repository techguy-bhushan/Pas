package com.springinaction.part1.chapter2.di.wirecollection.list;

import com.springinaction.part1.chapter2.di.wirecollection.commonservice.FortuneService;
import com.springinaction.part1.chapter2.di.wirecollection.commonservice.PlayerService;

import java.util.List;
public class CricketPlayerService implements PlayerService {
    private List<String> playersName;
    private List<FortuneService>  fortuneServices;

    public List<String> getPlayersName() {
        return playersName;
    }

    public List<FortuneService> getFortuneServices() {
        return fortuneServices;
    }

    public void setFortuneServices(List<FortuneService> fortuneServices) {
        this.fortuneServices = fortuneServices;
    }

    public void setPlayersName(List<String> playersName) {
        this.playersName = playersName;
    }

    public void displayName() {
        System.out.println("Here are our players:");
        for (String playerName : playersName) {
            System.out.println(playerName);
        }
    }
}
