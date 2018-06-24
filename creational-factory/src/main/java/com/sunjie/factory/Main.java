package com.sunjie.factory;

import com.sunjie.factory.factory.RobotFactory;

/**
 * Description: 工厂方法模式
 *            与简单工厂对比 优点:增加一个persion不用修改factory代码
 *            缺点：需要成对增加工厂类
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
