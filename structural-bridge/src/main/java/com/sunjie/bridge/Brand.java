package com.sunjie.bridge;

/**
 * Description:
 * User: sunjie
 * Date: 2018/8/6
 * Time: 下午9:22
 */
public abstract class Brand {

    protected Computer computer;

    public void setComputer( Computer computer){
        this.computer=computer;
    }


    public abstract void use();


}
