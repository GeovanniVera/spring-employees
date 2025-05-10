package com.employees.employeesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("pageTitle", "Inicio");
        return "index"; // O "home" si usas home.html
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("pageTitle", "Inicio");
        return "index"; // O "home"
    }

    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("pageTitle", "Test");
        return "test"; // O "home"
    }
}