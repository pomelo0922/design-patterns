package com.sunjie.adapter;

/**
 * Description:
 * User: sunjie
 * Date: 2018/8/5
 * Time: 下午9:58
 */
public class LightningAdapter extends Lightning implements Usb {

    @Override
    public void use() {
        push();
        System.out.println("适配 lightning->Usb");
    }
}
