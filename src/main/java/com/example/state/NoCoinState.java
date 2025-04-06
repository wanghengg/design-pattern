package com.example.state;

// 无币状态
public class NoCoinState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public NoCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("投币成功，您可以选择商品了。");
        vendingMachine.setState(vendingMachine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("没有硬币可以退币。");
    }

    @Override
    public void dispense() {
        System.out.println("请先投币。");
    }
}
