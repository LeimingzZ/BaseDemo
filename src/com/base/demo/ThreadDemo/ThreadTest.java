package com.base.demo.ThreadDemo;

/**
 * @ClassName 线程测试类
 * @Author leiming
 * @Date 2020/3/5 23:35
 * @Version 1.0
 **/
public class ThreadTest {

    public static void main(String[] args) {
        Thread thread1=new MyThread();
        thread1.run();
        thread1.start();
        System.out.println("main>>主线程= "+Thread.currentThread().getName());
    }
}
