package com.sunjie.clone.easy;

/**
 * 浅克隆 必须实现Cloneable，克隆后，对象不相等，但是里面的属性还是原来的同一个
 * Description:
 * User: sunjie
 * Date: 2018/8/5
 * Time: 下午12:44
 */
public class Main {

    public static void main(String[] args){
        Car car=new Car();
        car.setEngine("发动机");
        car.setWheel("四轮");

        Car car1 = (Car) car.clone();

        System.out.println(car1==car);
        System.out.println(car1.getEngine()==car.getEngine());
    }
}
