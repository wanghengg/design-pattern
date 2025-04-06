package com.example.creational.factorymethod;

public class Demo {
    public static void main(String[] args) {
        new CatFactory().createPet().speak();

        new DogFactory().createPet().speak();
    }
}
