package com.example.singleton;

/**
 * 普通懒汉式单例模式，无法应对并发场景
 */
public class Singleton {
    private Singleton() {}
    private static Singleton instance = null;
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
