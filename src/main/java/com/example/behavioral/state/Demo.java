package com.example.behavioral.state;

public class Demo {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(1);
        vendingMachine.insertCoin();
        vendingMachine.ejectCoin();
        vendingMachine.dispense();
        vendingMachine.insertCoin();
        vendingMachine.dispense();
        vendingMachine.insertCoin();
    }
}
