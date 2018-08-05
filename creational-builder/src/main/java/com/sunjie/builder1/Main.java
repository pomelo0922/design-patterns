package com.sunjie.builder1;

/**
 * Description:
 * User: sunjie
 * Date: 2018/8/5
 * Time: 下午12:21
 */
public class Main {


    public static void main(String[] args){
        Car car=new CarBuilder().buildEngine("发动机").buildWheel("四轮").build();
        System.out.println(car);
    }
}
