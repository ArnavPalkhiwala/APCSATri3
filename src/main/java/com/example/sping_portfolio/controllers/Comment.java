
package com.example.sping_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */

import com.example.sping_portfolio.controllers.UserComment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;


@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Comment {

    List<UserComment> luc = new ArrayList<>();

    @GetMapping("/comment")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String greeting(
            @RequestParam(name = "username", required = false, defaultValue = "First last") String username,
            @RequestParam(name = "comment", required = false, defaultValue = "[your comment here]") String comment,
            Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON

        UserComment uc = new UserComment(username, comment);

        uc.ChangeComment("time");

        luc.add(uc);

        //model.addAttribute("nameout", uc.GetUsername()); // MODEL is passed to html
        //model.addAttribute("commentout", uc.GetComment()); // MODEL is passed to html
        //model.addAttribute("dateout", uc.GetDate()); // MODEL is passed to html

        model.addAttribute("luc", luc);

        return "comment"; // returns HTML VIEW (greeting)
    }
}