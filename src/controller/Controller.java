package controller;

import model.impl.User;

public class Controller {
    public void saveUser(User user){
        user.save();
    }
    public void saveReport(User user){
        user.report();
    }
}
