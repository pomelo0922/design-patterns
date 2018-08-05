package com.sunjie.builder;

public class Main {

    //https://blog.csdn.net/gdutxiaoxu/article/details/52124383
    public static void main(String[] args) {

        PhoneBuilder phoneBuilder = new IphonePhoneBuilder();
        Director director = new Director(phoneBuilder);
        director.construct("摄像头","屏幕","cpu");

        System.out.println(phoneBuilder.create());

    }
}
