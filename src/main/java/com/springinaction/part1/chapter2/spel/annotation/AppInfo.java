package com.springinaction.part1.chapter2.spel.annotation;

import org.springframework.stereotype.Component;

@Component
public class AppInfo {

    private String url = "www.google.com";
    private int basePrice = 100;
    private int taxPrice = 10;

    public boolean isValidPort(int port) {
        return port > 50;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getTaxPrice() {
        return taxPrice;
    }

    public void setTaxPrice(int taxPrice) {
        this.taxPrice = taxPrice;
    }
}
