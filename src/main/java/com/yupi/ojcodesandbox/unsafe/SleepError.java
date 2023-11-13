package com.yupi.ojcodesandbox.unsafe;

import java.util.TreeMap;

/**
 * 无限睡眠（阻塞程序执行）
 */
public class SleepError {

    public static void main(String[] args) throws InterruptedException{
        long ONS_HOUR = 60 * 60 * 1000L;
        Thread.sleep(ONS_HOUR);
        System.out.println("睡完了");
    }
}
