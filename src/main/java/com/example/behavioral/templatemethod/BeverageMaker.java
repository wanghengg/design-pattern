package com.example.behavioral.templatemethod;

/**
 * 模板方法模式（Template Method Pattern）是一种行为型设计模式，它定义了一个算法的骨架，将一些步骤延迟到子类中实现。
 * 模板方法模式通过将算法的框架放在抽象类中，将具体的实现延迟到子类中，从而实现了算法的复用和扩展。
 * 模板方法模式的核心在于，定义一个算法的骨架，将一些步骤延迟到子类中实现。
 * 模板方法模式的优点在于，它可以将算法的框架放在抽象类中，将具体的实现延迟到子类中，从而实现了算法的复用和扩展。
 * 模板方法模式的缺点在于，它可能会导致子类的数量增加，因为每个子类都需要实现算法的框架。
 */
abstract class BeverageMaker {

    // 模板方法，定义算法的骨架
    public final void makeBeverage() {
        boilWater();
        brew();
        addCondiments();
        pourIntoCup();
    }

    // 具体步骤，子类无需重写
    private void boilWater() {
        System.out.println("将水煮沸");
    }

    // 具体步骤，子类无需重写
    private void pourIntoCup() {
        System.out.println("将饮料倒入杯中");
    }

    // 抽象步骤，子类需要实现
    abstract void brew();

    // 抽象步骤，子类需要实现
    abstract void addCondiments();
}
