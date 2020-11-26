package com.toby;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 单例模式-饿汉模式
 *
 * @Author: zhangbin
 * @Date: 2020/11/26
 */
public class HungryDemo {
    private AtomicInteger id = new AtomicInteger(0);
    public static HungryDemo instance = new HungryDemo();

    private HungryDemo() {
    }

    public static HungryDemo getInstance() {
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
                HungryDemo instance = HungryDemo.getInstance();
                System.out.println(instance + "==>" + instance.getId());
            }).start();
        }
    }
}
