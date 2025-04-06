package com.example.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class LazySingleton {
    private static final Logger log = Logger.getGlobal();
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
                log.info("第一次进来");
                // 第二重判断
                if (instance == null) {
                    log.info("第二次进来");
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> {
                LazySingleton instance = LazySingleton.getInstance();
                log.info("instance: " + instance);
            });
        }
        executorService.shutdown();
    }
}
