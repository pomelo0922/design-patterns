package com.sunjie.single;

/**
 * Description: 饿汉模式，无线程安全问题
 * User: sunjie
 * Date: 2018/8/5
 * Time: 下午1:20
 */
public class Singleton1 {

    private static Singleton1 singleton=new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance(){
        return singleton;
    }
}
