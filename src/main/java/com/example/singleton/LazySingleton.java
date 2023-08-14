package com.example.singleton;

public class LazySingleton {
    private LazySingleton() {}
    private volatile static LazySingleton instance;
    // 通过 synchronized 关键词解决并发问题，但是锁定范围比较大，导致性能降低
    /**
    synchronized public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
     */
    public static LazySingleton getInstance() {
        // 第一重判断
        if (instance == null) {
            // 使用 synchronized 关键词只锁定实例化过程，减小锁定范围
            synchronized (LazySingleton.class) {
                // 第二重判断
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
