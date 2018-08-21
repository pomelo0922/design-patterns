package com.sunjie.proxy.jdk;

import com.sunjie.proxy.Buy;
import com.sunjie.proxy.BuyHouse;

import java.lang.reflect.Proxy;

/**
 * Description:
 * User: sunjie
 * Date: 2018/8/21
 * Time: 下午3:37
 */
public class Main {
    public static void main(String[] args){
        Buy buy=new BuyHouse();
        Buy proxyBuyHouse = (Buy) Proxy.newProxyInstance(Buy.class.getClassLoader(),new Class[]{Buy.class}, new DynamicProxyHandler(buy));
        proxyBuyHouse.buyHouse();
    }
}
