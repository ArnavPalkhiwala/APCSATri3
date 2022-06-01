package com.example.sping_portfolio.controllers;

public class User implements java.io.Serializable {
    public String username;
    public String firstname;
    public String lastname;
    public String streetaddress;
    public String city;
    public String state;
    public String country;
    public int age;

    public void mailCheck() {
        System.out.println("Mailing a check to " + username);
    }
}
