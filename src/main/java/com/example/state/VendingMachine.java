package com.example.state;

public class VendingMachine {
    private VendingMachineState noCoinState;

    private VendingMachineState hasCoinState;

    private VendingMachineState soldOutState;

    private VendingMachineState curState;

    // 当前库存
    private int count;

    public VendingMachine(int count) {
        this.count = count;
        this.noCoinState = new NoCoinState(this);
        this.hasCoinState = new HasCoinState(this);
        this.soldOutState = new SoldOutState(this);
        if (count > 0) {
            this.curState = noCoinState;
        } else {
            this.curState = soldOutState;
        }
    }

    public void setState(VendingMachineState state) {
        this.curState = state;
    }

    public VendingMachineState getNoCoinState() {
        return noCoinState;
    }

    public VendingMachineState getHasCoinState() {
        return hasCoinState;
    }

    public VendingMachineState getSoldOutState() {
        return soldOutState;
    }

    public int getCount() {
        return count;
    }

    public void releaseProduct() {
        if (count > 0) {
            count--;
            System.out.println("商品售出，库存剩余：" + count);
        } else {
            System.out.println("商品售罄");
        }
    }

    public void insertCoin() {
        curState.insertCoin();
    }

    public void ejectCoin() {
        curState.ejectCoin();
    }

    public void dispense() {
        curState.dispense();
    }
}
