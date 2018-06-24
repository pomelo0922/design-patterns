package com.sunjie.factory;

import com.sunjie.factory.factory.RobotFactory;

/**
 * Description: 工厂方法模式
 *            优点：客户端不需要知道具体产品类的类名，只需要知道对应的工厂类。
 *            缺点：增加一个新产品，需要增加一个新产品类和一个具体工厂类，类种类成对增加
 *
 * User: sunjie
 * Date: 2018/6/24
 * Time: 下午5:32
 */
public class Main {

    public static void main(String[] args){
        //这个new可以放到xml中
        //个人认为这个模式和直接new一个robotPerison有区别吗？
        PersionFactory persionFactory=new RobotFactory();
        Persion persion = persionFactory.getPersion();
        persion.detail();
    }
}
