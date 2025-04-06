package com.example.state;

public class SoldOutState implements VendingMachineState {

    private VendingMachine vendingMachine;

    public SoldOutState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("商品售罄，无法投币。");
    }

    @Override
    public void ejectCoin() {
        System.out.println("没有硬币可以退币。");
    }

    @Override
    public void dispense() {
        System.out.println("商品售罄，无法购买。");
    }
}
