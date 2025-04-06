package com.example.strategy;

public class DiscountPromotion implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("进行打折促销，所有商品打8折。");
    }
}
