package model.impl;

import model.Savable;
import model.User;

public class Saver implements Savable<User> {
    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
