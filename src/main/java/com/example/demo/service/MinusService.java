package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MinusService {

    public int minus(int num1, int num2) {
        return num1 - num2; // 入力された数字から2を引く処理
    }
}