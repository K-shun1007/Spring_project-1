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
    private MinusService minusService; // CalculationServiceを注入します。
    
    @GetMapping("minus")
    public String index() {
        return "minus.html";
    }
    
    @PostMapping("minus")
    public String calculate(@RequestParam("num1") int num1,@RequestParam("num2") int num2, Model model) {
        int result = minusService.minus(num1, num2); // CalculationServiceのメソッドを呼び出します。
        model.addAttribute("result", result);
        return "minus";
    }
}