package com.example.behavioral.templatemethod;

public class TeaMaker extends BeverageMaker {
    @Override
    void brew() {
        System.out.println("用茶叶泡茶");
    }

    @Override
    void addCondiments() {
        System.out.println("添加柠檬");
    }
}
