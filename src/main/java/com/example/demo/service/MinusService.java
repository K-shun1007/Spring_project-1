package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MinusService {

    public int calculate(int number) {
        return number - 2; // 入力された数字から2を引く処理
    }
}