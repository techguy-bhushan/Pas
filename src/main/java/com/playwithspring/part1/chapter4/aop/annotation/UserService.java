package com.playwithspring.part1.chapter4.aop.annotation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class UserService {

    private List<User> users = new ArrayList<>();
    private AtomicInteger idGenerater = new AtomicInteger(0);


    public User getUser(int id) {
        Optional<User> user = users.stream().filter(u -> u.getId() == id).findFirst();
        return user.isPresent() ? user.get() : null;

    }

    public void addUser(User user) {
        if (user == null) {
            throw new NullPointerException("User can't be null");
        }

        user.setId(idGenerater.getAndAdd(1));

    }

    public boolean isUserExistWithId(Long id) {
        return users.stream().anyMatch( u -> u.getId() == id);
    }
}
