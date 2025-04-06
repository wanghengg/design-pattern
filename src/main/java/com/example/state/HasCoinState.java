package com.example.state;

public class HasCoinState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public HasCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("已经投币，请勿重复投币");
    }

    @Override
    public void ejectCoin() {
        System.out.println("退币成功");
        vendingMachine.setState(vendingMachine.getNoCoinState());
    }

    @Override
    public void dispense() {
        if (vendingMachine.getCount() > 0) {
            System.out.println("购买成功，出货");
            vendingMachine.releaseProduct();
            if (vendingMachine.getCount() == 0) {
                System.out.println("商品售罄");
                vendingMachine.setState(vendingMachine.getSoldOutState());
            } else {
                vendingMachine.setState(vendingMachine.getNoCoinState());
            }
        } else {
            System.out.println("商品售罄");
            vendingMachine.setState(vendingMachine.getSoldOutState());
        }
    }
}
