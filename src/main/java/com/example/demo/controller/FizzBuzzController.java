package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FizzBuzzController {

    @GetMapping("Fizzbuzz")
    public String fizzBuzz(Model model) {
        List<String> fizzBuzzList = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzList.add("fizzbuzz");
            } else if (i % 3 == 0) {
                fizzBuzzList.add("fizz");
            } else if (i % 5 == 0) {
                fizzBuzzList.add("buzz");
            } else {
                fizzBuzzList.add(String.valueOf(i));
            }
        }
        model.addAttribute("fizzBuzzList", fizzBuzzList);
        return "fizzbuzz";
    }
}
