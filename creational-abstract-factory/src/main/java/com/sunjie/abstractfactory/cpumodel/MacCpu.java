package com.sunjie.abstractfactory.cpumodel;


import com.sunjie.abstractfactory.Cpu;

/**
 * Description:
 * User: sunjie
 * Date: 2018/6/24
 * Time: 下午5:50
 */
public class MacCpu implements Cpu {
    public void detail() {
        System.out.println("mac cpu");
    }
}
