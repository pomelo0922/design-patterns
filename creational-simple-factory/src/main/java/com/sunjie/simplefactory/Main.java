package com.sunjie.simplefactory;

/**
 * Description: 简单工厂方法
 * User: sunjie
 * Date: 2018/6/24
 * Time: 下午4:32
 */
public class Main {

    public static void main(String[] args){
        //W  M R
        Persion persion = PersionFactory.getPersion("R");
        persion.detail();
    }
}
