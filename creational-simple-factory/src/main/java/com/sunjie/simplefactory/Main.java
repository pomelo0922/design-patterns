package com.sunjie.simplefactory;

/**
 * Description: 简单工厂方法
 *    简单工厂模式违背了开闭原则：当需要添加新产品时，需要在工厂类的静态方法中添加新产品的创建逻辑，这样就修改了原来的代码，复用性降低
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
