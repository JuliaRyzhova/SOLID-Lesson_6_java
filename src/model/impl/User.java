package model.impl;

import model.Reportable;
import model.Savable;

public class User implements Savable, Reportable {
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public void save() {
        System.out.println("Save user: " + this.name);
    }

    @Override
    public void report() {
        System.out.println("Report for user: " + this.name);
    }
}
