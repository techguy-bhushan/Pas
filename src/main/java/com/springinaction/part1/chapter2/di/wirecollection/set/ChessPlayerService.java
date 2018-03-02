package com.springinaction.part1.chapter2.di.wirecollection.set;

import com.springinaction.part1.chapter2.di.wirecollection.commonservice.FortuneService;
import com.springinaction.part1.chapter2.di.wirecollection.commonservice.PlayerService;

import java.util.Set;

public class ChessPlayerService implements PlayerService {
    private Set<String> playersName;
    private Set<FortuneService>  fortuneServices;

    public Set<String> getPlayersName() {
        return playersName;
    }

    public void setPlayersName(Set<String> playersName) {
        this.playersName = playersName;
    }

    public Set<FortuneService> getFortuneServices() {
        return fortuneServices;
    }

    public void setFortuneServices(Set<FortuneService> fortuneServices) {
        this.fortuneServices = fortuneServices;
    }

    public void displayName() {
        System.out.println("Here are our players:");
        for (String playerName : playersName) {
            System.out.println(playerName);
        }
    }
}
