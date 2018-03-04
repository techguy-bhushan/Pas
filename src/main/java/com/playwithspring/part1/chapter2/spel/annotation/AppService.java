package com.playwithspring.part1.chapter2.spel.annotation;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AppService {
    @Value("#{appInfo.getUrl()}")
    private String url;

    @Value("#{appInfo.getBasePrice() + appInfo.getTaxPrice()}")
    private int totalPrice;

    @Value("#{appInfo.isValidPort(80)}")
    private boolean isValidPort;

    public void displayInfo() {
        System.out.println("App url :"+ url);
        System.out.println("App total price :"+ totalPrice);
        System.out.println("80 is valid port:"+ isValidPort);
    }
}
