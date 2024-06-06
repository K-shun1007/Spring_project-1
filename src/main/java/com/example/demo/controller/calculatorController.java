package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.calculatorService;

@SpringBootApplication
@Controller
public class calculatorController {

    @Autowired
    private calculatorService calculatorService;

    public static void main(String[] args) {
        SpringApplication.run(calculatorController.class, args);
    }

    @GetMapping("calculator")
    public String showForm() {
        return "calculator";
    }

    @PostMapping("calculate")
    public String calculate(@RequestParam int number1, @RequestParam int number2, @RequestParam String operator, Model model) {
        try {
            int result = calculatorService.calculate(number1, number2, operator);
            model.addAttribute("result", result);
        } catch (IllegalArgumentException | ArithmeticException e) {
            model.addAttribute("error", e.getMessage());
        }
        return "calculator";
    }
}