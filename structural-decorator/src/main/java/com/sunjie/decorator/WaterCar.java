package com.sunjie.decorator;

/**
 * Description:
 * User: sunjie
 * Date: 2018/8/13
 * Time: 下午8:52
 */
public class WaterCar extends DecoratorCar {

    public WaterCar(Car car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        fly();
    }

    public void fly() {
        System.out.println("水行驶汽车");
    }
}
