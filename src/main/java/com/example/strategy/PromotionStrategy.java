package com.example.strategy;

/**
 * 策略模式（Strategy Pattern）是一种行为型设计模式，它定义了一系列算法，
 * 并将每个算法封装起来，使它们可以相互替换，且算法的变化不会影响使用算法的客户。
 * 策略模式通常用于解决在不同情况下选择不同算法的问题，
 * 可以使代码更加灵活、可扩展和易于维护。
 */
public interface PromotionStrategy {
    void doPromotion();
}
