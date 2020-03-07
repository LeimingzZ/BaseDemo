package com.base.demo.ThreadDemo;

/**
 * @ClassName 自定义runnable
 * @Author leiming
 * @Date 2020/3/5 23:33
 * @Version 1.0
 **/
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("myRunnable>>当前执行线程= "+Thread.currentThread().getName());
    }
}
