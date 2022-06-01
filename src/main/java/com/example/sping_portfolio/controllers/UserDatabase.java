package com.example.sping_portfolio.controllers;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserDatabase implements java.io.Serializable {
    public Map<String, User> userlist = new ConcurrentHashMap<>();

    public  boolean createUser(String username, String firstname, String lastname, String streetaddress, String city, String state, String country, int age) {
        User e = new User();
        e.username = username;
        e.firstname = firstname;
        e.lastname = lastname;
        e.streetaddress = streetaddress;
        e.city = city;
        e.state = state;
        e.country = country;
        e.age = age;

        return addUser(e.username, e);
    }

    public boolean addUser(String username, User u) {
        if (userlist.containsKey(username)) {
            return false;
        }

        userlist.put(username, u);
        return true;
    }

    public boolean deleteUser(String username) {
        if(userlist.containsKey(username)) {
            userlist.remove(username);
            return true;
        }

        return false;
    }
}

