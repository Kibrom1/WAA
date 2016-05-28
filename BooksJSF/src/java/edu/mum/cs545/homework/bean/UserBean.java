/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.homework.bean;

import edu.mum.cs545.homework.pojo.User;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author kb
 */
@Named(value = "userbean")
@ApplicationScoped
public class UserBean {

    private User user = new User();

    public UserBean() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    

    public String validUser() {
        
        //this.user.setName("kb");
        
        if (this.user.getName().equals("kb") && this.user.getPassword().equals("kb")) {
            return "home.jsf";
        }

        return "login.jsf";
    }
}
