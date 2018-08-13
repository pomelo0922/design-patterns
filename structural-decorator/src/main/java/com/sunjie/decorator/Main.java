package com.sunjie.decorator;

/**
 * Description:
 * User: sunjie
 * Date: 2018/8/13
 * Time: 下午8:54
 */
public class Main {
    public static void main(String[] args){


        //普通
        ICar decoratorCar=new Car();
        decoratorCar.move();


        //装饰一下
        ICar car=new FlyCar(decoratorCar);
        car.move();

    }
}
