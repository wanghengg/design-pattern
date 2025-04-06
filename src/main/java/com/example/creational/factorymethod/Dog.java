package com.example.creational.factorymethod;

public class Dog implements Pet {
    @Override
    public void speak() {
        System.out.println("汪汪汪");
    }
}
