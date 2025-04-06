package com.example.creational.factorymethod;

/**
 * 工厂方法模式（Factory Method Pattern）是一种创建型设计模式，它定义了一个创建对象的接口，但由子类决定实例化哪一个类。
 * 工厂方法模式将对象的创建和使用分离，使得代码的耦合度降低，提高了可维护性和可扩展性。在工厂方法模式中，有一个抽象的工厂类，
 * 它声明了创建对象的方法，具体的创建逻辑由继承自该抽象工厂类的具体工厂类来实现。
 */
public abstract class PetFactory {
    public abstract Pet createPet();
}
