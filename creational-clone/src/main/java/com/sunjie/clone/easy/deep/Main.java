package com.sunjie.clone.easy.deep;

import com.sunjie.clone.easy.Car;

/**
 * 深克隆 必须实现Serializable，克隆后，对象不相等，里面的属性也不等
 * Description:
 * User: sunjie
 * Date: 2018/8/5
 * Time: 下午12:54
 */
public class Main {

    public static void main(String[] args){


        Phone phone=new Phone();
        phone.setCamera("相机");
        phone.setCpu("A11");
        phone.setCar(new Car());

        Phone phone1 = phone.deepClone();

        System.out.println(phone1==phone);
        System.out.println(phone1.getCamera()==phone.getCamera());
        System.out.println(phone1.getCar()==phone.getCar());
    }
}
