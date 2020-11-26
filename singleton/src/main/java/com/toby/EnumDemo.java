package com.toby;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: zhangbin
 * @Date: 2020/11/26
 */
public enum EnumDemo {
    INSTANCE;
    private AtomicInteger id = new AtomicInteger(0);

    public int getId() {
        return id.incrementAndGet();
    }
}
