package com.sunjie.decorator;

/**
 * Description:
 * User: sunjie
 * Date: 2018/8/13
 * Time: 下午8:52
 */
public class FlyCar extends DecoratorCar {

    public FlyCar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        fly();
    }

    public void fly() {
        System.out.println("空中行驶汽车");
    }
}
