package com.example.sping_portfolio;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoggedIn {
    public static boolean isLoggedIn = false;

    public void changeLogIn() {
        isLoggedIn = !isLoggedIn;
    }

    public void setLogOut() {
        isLoggedIn = false;
    }

    public boolean getIsLoggedIn() {
        return isLoggedIn;
    }

    public static LoggedIn thisLogIn = new LoggedIn();

    @GetMapping("/loginAPI")
    @ResponseBody
    public String logInUser(@RequestParam(name = "username", required = false, defaultValue = "") String username,
                            @RequestParam(name = "password", required = false, defaultValue = "") String password) throws IOException {
        if (username.contains("k")) {
            if (password.equals("Password123!")) {
                System.out.println("IOUSYDUVBIDN");
                thisLogIn.changeLogIn();
                return "true";
                //return "redirect:/newtest";
            }
        }
        //  return "redirect:/newtest";
        return "false";
    }

    @GetMapping("/logoutAPI")
    @ResponseBody
    public String logOutUser(@RequestParam(name = "click", required = false, defaultValue = "") String click) throws IOException {
        if (click.contains("k")) {
            thisLogIn.setLogOut();
        }
        //  return "redirect:/newtest";
        return "false";
    }
    

}

