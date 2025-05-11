package com.employees.employeesapp.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class TestController {

    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("pageTitle", "Test");
        return "test";
    }
}
