package com.example.sping_portfolio.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserComment {
    public String name; // attributes
    public String comment;
    public String date;


    public UserComment(String name, String comment){ // constructor
        this.name = name;
        this.comment = comment;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.date = dtf.format(now);
    }

    public String AddtoComment(String extra){
        comment = comment + " " + extra;
        return comment;
    }

    public void ChangeComment(String newcapital){
        if (comment.contains(newcapital)) {
            int x = comment.indexOf(newcapital);
            comment = comment.substring(0, x) + "[" + newcapital + "]" + comment.substring(x + newcapital.length());
        }
    }

    public void Display(){
        System.out.println(comment);
    }

    public String GetName(){
        return name;
    }

    public String GetComment(){
        return comment;
    }

    public String GetDate(){
        return date;
    }

}

