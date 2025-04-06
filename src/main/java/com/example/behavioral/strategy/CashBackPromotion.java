package com.example.behavioral.strategy;

public class CashBackPromotion implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("执行返现促销策略，满100返20元");
    }
}
