package com.sunjie.decorator;

/**
 * Description:
 * User: sunjie
 * Date: 2018/8/13
 * Time: 下午8:51
 */
public class DecoratorCar implements ICar {

    private ICar car;

    public DecoratorCar(ICar car){
        this.car=car;
    }

    public void move() {
        car.move();
    }
}
