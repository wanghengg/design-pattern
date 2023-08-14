package com.example.singleton;

/**
 * 饿汉式单例模式：在类加载时就初始化了实例，并发调用 getInstance()方法时可以避免竞争导致重复创建实例
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println(eagerSingleton2 == eagerSingleton2);
    }
}
