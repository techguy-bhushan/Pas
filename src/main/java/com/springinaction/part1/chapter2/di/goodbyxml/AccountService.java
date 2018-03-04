package com.springinaction.part1.chapter2.di.goodbyxml;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    public void processAccount() {
        System.out.println("Processing account.................");
    }
}
