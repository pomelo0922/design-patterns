package com.sunjie.clone.easy;

import java.io.Serializable;

/**
 * Description:
 * User: sunjie
 * Date: 2018/8/5
 * Time: 下午12:44
 */
public class Car implements Cloneable,Serializable {

    private String engine;

    private String wheel;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
