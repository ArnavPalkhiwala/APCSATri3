package com.example.sping_portfolio.controllers;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.sping_portfolio.controllers.Student;

@Controller
public class StudentController {
    @GetMapping("/student")
    public String getForm(Model model) {
        model.addAttribute("student", new Student());
        return "student";
    }
    @PostMapping("/student")
    public String submitStudentDetails(@ModelAttribute Student student, Errors errors, Model model) {
        if (null != errors && errors.getErrorCount() > 0) {
            System.out.println("Student UI1: " + student.getUserId());

            return "result";
        } else {
            System.out.println("Student UI2: " + student.getUserId());
            model.addAttribute("student", student);
            model.addAttribute("successMsg", "Details saved successfully!!");
            return "success";
        }
    }
}
