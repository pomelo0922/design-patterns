package com.sunjie.builder1;

/**
 * Description:
 * User: sunjie
 * Date: 2018/8/5
 * Time: 下午12:23
 */
public class NewCar implements Car {
    private String engine;

    private String wheel;

    public void setEngine(String engine) {
        this.engine=engine;
    }

    public void setWheel(String wheel) {
        this.wheel=wheel;
    }


    @Override
    public String toString() {
        return "NewCar{" +
                "engine='" + engine + '\'' +
                ", wheel='" + wheel + '\'' +
                '}';
    }
}
