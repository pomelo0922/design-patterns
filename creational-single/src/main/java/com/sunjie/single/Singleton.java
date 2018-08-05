package com.sunjie.single;

/**
 * Description: 懒汉模式，有线程安全问题
 * User: sunjie
 * Date: 2018/8/5
 * Time: 下午1:20
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton(){}

    public static Singleton getInstance(){
        return singleton==null?new Singleton():singleton;
    }
}
