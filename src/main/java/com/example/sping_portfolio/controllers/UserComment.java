package com.example.sping_portfolio.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserComment {
    public String username; // attributes
    public String comment;
    public String date;


    public UserComment(String username, String comment){ // constructor
        this.username = username;
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

    public String GetUsername(){
        return username;
    }

    public String GetComment(){
        return comment;
    }

    public String GetDate(){
        return date;
    }

}

