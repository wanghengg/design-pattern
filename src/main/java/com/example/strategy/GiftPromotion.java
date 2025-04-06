package com.example.strategy;

public class GiftPromotion implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("进行赠送礼品促销，购买商品赠送精美小礼品。");
    }
}
