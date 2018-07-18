package com.sunjie.abstractfactory;

import com.sunjie.abstractfactory.factory.MacComputerFactory;

/**
 * Description: 抽象工厂模式
 *              定义一个超级工厂 （电脑）
 *              用于创建其他工厂 （cpu ram）
 *
 *
 * User: sunjie
 * Date: 2018/6/24
 * Time: 下午4:30
 */
public class Main {

    public static void main(String[] args){
        //个人理解为，工厂模式的提升版，工厂模式是针对一种产品，抽象工厂模式是针对多种产品
        //比如工厂模式针对 人的创建
        //抽象工厂模式正对 cpu  ram的创建 cpu和ram又可以归到一个超级工厂中
        ComputerFactory mac=new MacComputerFactory();
        mac.getCpu().detail();
        mac.getRam().detail();
    }
}
