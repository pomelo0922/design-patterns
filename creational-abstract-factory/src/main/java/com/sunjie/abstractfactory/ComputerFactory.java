package com.sunjie.abstractfactory;

/**
 * Description:
 * User: sunjie
 * Date: 2018/6/24
 * Time: 下午5:54
 */
public interface ComputerFactory {
    Cpu getCpu();
    Ram getRam();
}
