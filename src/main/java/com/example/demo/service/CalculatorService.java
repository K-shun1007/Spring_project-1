package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int calculate(int number1, int number2, String operator) throws IllegalArgumentException, ArithmeticException {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if (number2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                return number1 / number2;
            default:
                throw new IllegalArgumentException("Invalid operator.");
        }
    }
}