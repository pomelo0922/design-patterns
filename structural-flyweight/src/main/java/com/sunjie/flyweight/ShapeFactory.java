package com.sunjie.flyweight;

import java.util.HashMap;

/**
 * Description:
 * User: sunjie
 * Date: 2018/8/21
 * Time: 上午9:49
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
