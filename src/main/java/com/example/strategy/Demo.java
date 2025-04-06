package com.example.strategy;

public class Demo {
    public static void main(String[] args) {
        // 创建打折促销活动
        PromotionActivity discountPromotionActivity = new PromotionActivity(new DiscountPromotion());
        // 执行促销活动
        discountPromotionActivity.executePromotion();
        
        // 创建满减促销活动
        PromotionActivity cashBackPromotionActivity = new PromotionActivity(new CashBackPromotion());
        cashBackPromotionActivity.executePromotion();

        // 创建赠送礼品促销活动
        PromotionActivity giftPromotionActivity = new PromotionActivity(new GiftPromotion());
        giftPromotionActivity.executePromotion();
    }
}
