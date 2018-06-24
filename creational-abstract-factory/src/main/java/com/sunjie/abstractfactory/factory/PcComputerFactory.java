package com.sunjie.abstractfactory.factory;

import com.sunjie.abstractfactory.ComputerFactory;
import com.sunjie.abstractfactory.Cpu;
import com.sunjie.abstractfactory.Ram;
import com.sunjie.abstractfactory.cpumodel.MacCpu;
import com.sunjie.abstractfactory.cpumodel.PcCpu;
import com.sunjie.abstractfactory.rammodel.MacRam;
import com.sunjie.abstractfactory.rammodel.PcRam;

/**
 * Description:
 * User: sunjie
 * Date: 2018/6/24
 * Time: 下午5:54
 */
public class PcComputerFactory implements ComputerFactory {


    public Cpu getCpu() {
        return new PcCpu();

    }

    public Ram getRam() {
        return new PcRam();
    }
}
