package com.example.creational.factorymethod;

public class DogFactory extends PetFactory {
    @Override
    public Pet createPet() {
        return new Dog();
    }
}
