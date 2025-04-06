package com.example.behavioral.templatemethod;

public class Demo {
    public static void main(String[] args) {
        BeverageMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.makeBeverage();
        System.out.println("-------------------------");
        BeverageMaker teaMaker = new TeaMaker();
        teaMaker.makeBeverage();
    }
}
