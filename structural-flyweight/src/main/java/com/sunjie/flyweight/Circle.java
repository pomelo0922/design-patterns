package com.sunjie.flyweight;

/**
 * Description:
 * User: sunjie
 * Date: 2018/8/21
 * Time: 上午9:47
 */
public class Circle implements Shape {

    private String color;
    private int x;
    private int y;

    public Circle(String color){
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String draw() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

}
