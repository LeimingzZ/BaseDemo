package com.base.demo.reflect;

/**
 * @ClassName 自定义类加载器测试
 * @Author leiming
 * @Date 2020/2/18 21:44
 * @Version 1.0
 **/
public class MyClassLoaderChecker {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        CustomClassLoader cc=new CustomClassLoader("G:\\test\\","myClassLoader");

        Class<?> wali = cc.loadClass("Wali");
        System.out.println(wali.getClassLoader());
        System.out.println(wali.getClassLoader().getParent());
        wali.newInstance();
    }
}
