package com.example.behavioral.state;

/**
 * 状态模式（State Pattern）是一种行为型设计模式，它允许一个对象在其内部状态改变时改变它的行为，
 * 对象看起来似乎修改了它的类。状态模式将状态的判断逻辑和状态对应的行为封装在不同的状态类中，
 * 使得状态的切换和行为的执行更加清晰和易于维护，避免了大量的条件判断语句（如 if-else 或 switch）。
 */

public interface VendingMachineState {
    // 投币
    void insertCoin();
    // 退币
    void ejectCoin();
    // 购买商品
    void dispense();
}
