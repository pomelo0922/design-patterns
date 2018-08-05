package com.sunjie.clone.easy.deep;

import com.sunjie.clone.easy.Car;

import java.io.*;
import java.util.List;

/**
 * 需要构建的产品
 */
public class Phone implements Serializable  {

    private String cpu;
    private String camera;

    private Car car;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Phone deepClone() {
        try {
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bao);
            oos.writeObject(this);


            ByteArrayInputStream bai=new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream ois=new ObjectInputStream(bai);
            return (Phone) ois.readObject();
        } catch (Exception e) {
            ;
        }
        return null;
    }


}
