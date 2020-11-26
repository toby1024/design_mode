package com.toby;

import java.util.Random;

/**
 * @Author: zhangbin
 * @Date: 2020/11/26
 */
public class EnumDemoTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(new Random().nextInt(10000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                EnumDemo instance = EnumDemo.INSTANCE;
                System.out.println(instance + "==>" + instance.getId());
            }).start();
        }
    }
}
