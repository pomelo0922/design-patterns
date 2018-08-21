package com.sunjie.proxy.cglib;

import com.sunjie.proxy.Buy;
import com.sunjie.proxy.BuyHouse;

/**
 * Description:
 * User: sunjie
 * Date: 2018/8/21
 * Time: 下午3:45
 */
public class Main {

    public static void main(String[] args){
        CglibProxy cglibProxy = new CglibProxy();
        BuyHouse proxyBuyHouse = (BuyHouse) cglibProxy.getInstance(new BuyHouse());

        proxyBuyHouse.buyHouse();

    }
}
