package com.example.sping_portfolio;

public class LoggedIn {
    public static boolean isLoggedIn = false;

    public void changeLogIn() {
        isLoggedIn = !isLoggedIn;
    }

    public boolean getIsLoggedIn() {
        return isLoggedIn;
    }

    public static LoggedIn thisLogIn = new LoggedIn();

}

