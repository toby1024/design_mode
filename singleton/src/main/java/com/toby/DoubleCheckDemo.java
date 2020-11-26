package com.toby;

import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 单例模式-双重检测
 *
 * @Author: zhangbin
 * @Date: 2020/11/26
 */
public class DoubleCheckDemo {
    private AtomicInteger id = new AtomicInteger(0);
    public static DoubleCheckDemo instance;

    private DoubleCheckDemo() {
    }

    public static DoubleCheckDemo getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (DoubleCheckDemo.class) {
                System.out.println("加锁操作");
                if (Objects.isNull(instance)) {
                    instance = new DoubleCheckDemo();
                }
            }
        }
        return instance;
    }

    public int getId() {
        return id.incrementAndGet();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(new Random().nextInt(10000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                DoubleCheckDemo instance = DoubleCheckDemo.getInstance();
                System.out.println(instance + "==>" + instance.getId());
            }).start();
        }
    }
}
