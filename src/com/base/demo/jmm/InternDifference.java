package com.base.demo.jmm;

/**
 * @ClassName intern方法区别
 * @Author leiming
 * @Date 2020/2/19 10:46
 * @Version 1.0
 **/
public class InternDifference {

    public static void main(String[] args) {
        String s1=new String("a");
        s1.intern();
        String s2="a";
        System.out.println(s1==s2);
        String s3=new String("a")+new String("a");
        s3.intern();
        String s4="aa";
        System.out.println(s3==s4);
    }
}
