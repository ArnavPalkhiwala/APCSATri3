
package com.example.sping_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */

// import com.example.sping_portfolio.controllers.UserComment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;

@Controller // HTTP requests are handled as a controller, using the @Controller annotation
public class Comment {
    List<UserComment> luc = new ArrayList<>();

    @GetMapping("/comment")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does
    // variable bindings
    public String greeting(
            @RequestParam(name = "username", required = false, defaultValue = "No Username given") String username,
            @RequestParam(name = "comment", required = false, defaultValue = "No Comment given") String comment,
            Model model) {
        // @RequestParam handles required and default values, name and model are class
        // variables, model looking like JSON

        UserComment uc = new UserComment(username, comment);

        uc.ChangeComment("time");

        String prevUsername = "";

        if (!(uc.GetName().equals(prevUsername))) {
            if (!uc.name.equals("No Username given") && !uc.comment.equals("No Comment given")) {
                luc.add(uc);
                model.addAttribute("nameout", uc.GetName());
                model.addAttribute("commentout", uc.GetComment());
                model.addAttribute("dateout", uc.GetDate());
            }
        }

        model.addAttribute("luc", luc);



        prevUsername = uc.GetName();

        return "comment";
    }
}