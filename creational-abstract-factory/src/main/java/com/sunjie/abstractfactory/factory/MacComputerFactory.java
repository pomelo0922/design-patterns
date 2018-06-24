package com.sunjie.abstractfactory.factory;

import com.sunjie.abstractfactory.ComputerFactory;
import com.sunjie.abstractfactory.Cpu;
import com.sunjie.abstractfactory.Ram;
import com.sunjie.abstractfactory.cpumodel.MacCpu;
import com.sunjie.abstractfactory.rammodel.MacRam;

/**
 * Description:
 * User: sunjie
 * Date: 2018/6/24
 * Time: 下午5:54
 */
public class MacComputerFactory implements ComputerFactory {


    public Cpu getCpu() {
        return new MacCpu();

    }

    public Ram getRam() {
        return new MacRam();
    }
}
