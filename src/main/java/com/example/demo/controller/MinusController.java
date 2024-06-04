package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.MinusService;



@Controller
public class MinusController {

    @Autowired
    private MinusService MinusService; // CalculationServiceを注入します。
    
    @GetMapping("minus")
    public String index() {
        return "index";
    }
    
    @PostMapping("minuscalculate")
    public String calculate(@RequestParam("number") int number, Model model) {
        int result = MinusService.calculate(number); // CalculationServiceのメソッドを呼び出します。
        model.addAttribute("result", result);
        return "index";
    }
}