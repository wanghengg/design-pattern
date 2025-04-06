package com.example.creational.factorymethod;

public class CatFactory extends PetFactory {
    @Override
    public Pet createPet() {
        return new Cat();
    }
}
