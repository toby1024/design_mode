package com.toby;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 单例模式-静态内部类实现
 *
 * @Author: zhangbin
 * @Date: 2020/11/26
 */
public class InnerClassDemo {

    private AtomicInteger id = new AtomicInteger(0);

    private InnerClassDemo() {
    }

    private static class InnerClassDemoHolder {
        private static final InnerClassDemo instance = new InnerClassDemo();
    }

    public static InnerClassDemo getInstance() {
        return InnerClassDemoHolder.instance;
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
                InnerClassDemo instance = InnerClassDemo.getInstance();
                System.out.println(instance + "==>" + instance.getId());
            }).start();
        }
    }
}
