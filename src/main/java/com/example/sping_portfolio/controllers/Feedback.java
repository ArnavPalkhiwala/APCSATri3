package com.example.sping_portfolio.controllers;

public class Feedback implements java.io.Serializable {
    public String name;
    public String date;
    public String content;

    public String GetName(){
        return name;
    }

    public String GetComment(){
        return content;
    }

    public String GetDate(){
        return date;
    }

}
