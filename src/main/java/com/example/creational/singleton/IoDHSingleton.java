package com.example.creational.singleton;

/**
 * IoDHSingleton类加载时由于 instance 不是该类的成员对象，所以不需要加载。当调用 getInstance 方法时
 * 加载 HolderClass 时才需要实例化 instance，实现了懒汉式延迟加载，同时依赖于 jvm 实现线程安全（jvm 保证 HolderClass 类只加载一次），
 * 避免使用 synchronized 关键词加锁降低性能。
 */
public class IoDHSingleton {
    private IoDHSingleton() {}
    private static class HolderClass{
        private static final IoDHSingleton instance = new IoDHSingleton();
    }
    public static IoDHSingleton getInstance() {
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        IoDHSingleton s1, s2;
        s1 = IoDHSingleton.getInstance();
        s2 = IoDHSingleton.getInstance();
        System.out.println(s1 == s2);
    }
}
