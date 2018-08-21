package com.sunjie.flyweight;

/**
 * Description: 相同部分和不同部分，不用创建多个class类，相同部分比如这个红色，不同部分比如这个坐标点 x y ，红色部分是缓存的，不会创建多个对象
 * User: sunjie
 * Date: 2018/8/21
 * Time: 上午9:50
 */
public class Main {

    public static void main(String[] args){

        for (int i=0;i<5;i++){
            Circle red = (Circle)ShapeFactory.getCircle("红色");
            red.setX(100*i);
            red.setY(200*i);
            String draw = red.draw();
            System.out.println(draw+red.hashCode());
        }

    }
}
