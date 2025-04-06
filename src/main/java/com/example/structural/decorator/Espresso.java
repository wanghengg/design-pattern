package com.example.structural.decorator;

public class Espresso implements Coffee {
    @Override
    public String getDescription() {
        return "浓缩咖啡";
    }

    @Override
    public double getCost() {
        return 2.5;
    }
}
