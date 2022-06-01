package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.ResponseBody;
import com.example.sping_portfolio.Main;
import com.example.sping_portfolio.LoggedIn;

@Controller  
public class Videos {
    @GetMapping("/videos")
    public String CalendarPage() {
        System.out.println(LoggedIn.thisLogIn.getIsLoggedIn());
        if (LoggedIn.thisLogIn.getIsLoggedIn()) {
            return "videos";
        } else {
            return "loginerror";
        }
        
    }
}