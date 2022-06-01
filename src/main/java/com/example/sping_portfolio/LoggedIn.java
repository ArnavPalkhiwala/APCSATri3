package com.example.sping_portfolio;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class LoggedIn {
    public static boolean isLoggedIn = false;

    public void changeLogIn() {
        isLoggedIn = !isLoggedIn;
    }

    public boolean getIsLoggedIn() {
        return isLoggedIn;
    }

    public static LoggedIn thisLogIn = new LoggedIn();

    @GetMapping("/loginAPI")
    @ResponseBody
    public String logInUser(@RequestParam(name = "username", required = false, defaultValue = "") String username,
                            @RequestParam(name = "password", required = false, defaultValue = "") String password) throws IOException {

        if (username.equals("admin@example.com")) {
            if (password.equals("Password123!")) {
                thisLogIn.changeLogIn();
                return "Success!";
            }
        }

        return "Login Failure";
    }

}

