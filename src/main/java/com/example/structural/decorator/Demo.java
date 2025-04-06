package com.example.structural.decorator;

public class Demo {
    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        System.out.println("基础咖啡: " + espresso.getDescription() + "，价格: $" + espresso.getCost());

        MilkDecorator withMilkCoffee = new MilkDecorator(espresso);
        System.out.println("加奶咖啡: " + withMilkCoffee.getDescription() + "，价格: $" + withMilkCoffee.getCost());

        SugarDecorator withSugarMilkCoffee = new SugarDecorator(withMilkCoffee);
        System.out.println("加奶加糖咖啡: " + withSugarMilkCoffee.getDescription() + "，价格: $" + withSugarMilkCoffee.getCost());
    }
}
