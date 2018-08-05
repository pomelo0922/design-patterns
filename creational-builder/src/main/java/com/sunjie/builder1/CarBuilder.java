package com.sunjie.builder1;

/**
 * Description:
 * User: sunjie
 * Date: 2018/8/5
 * Time: 下午12:19
 */
public class CarBuilder {
    private Car car;

    public CarBuilder() {
        car = new NewCar();
    }

    public CarBuilder buildEngine(String engine){
        car.setEngine(engine);
        return this;
    }

    public CarBuilder buildWheel(String wheel){
        car.setWheel(wheel);
        return this;
    }

    public Car build(){
        return car;
    }
}
