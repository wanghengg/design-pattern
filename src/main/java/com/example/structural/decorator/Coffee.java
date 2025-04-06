package com.example.structural.decorator;

/**
 * 装饰器模式（Decorator Pattern）是一种结构型设计模式，它允许向一个现有的对象添加新的功能，
 * 同时又不改变其结构。装饰器模式通过创建一个包装对象，即装饰器，来包裹真实对象，并在不修改原
 * 始类代码的情况下，动态地为对象添加额外的职责或行为。装饰器和被装饰对象实现同一个接口或继承
 * 同一个抽象类，这样装饰器可以在运行时递归地嵌套，从而实现多种功能的组合。
 */
public interface Coffee {
    String getDescription();
    double getCost();
}
