package com.example.templatemethod;

public class CoffeeMaker extends BeverageMaker {
    @Override
    void brew() {
        System.out.println("用咖啡豆冲泡咖啡");
    }

    @Override
    void addCondiments() {
        System.out.println("添加糖和牛奶");
    }
}
