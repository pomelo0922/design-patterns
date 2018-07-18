package com.sunjie.builder;

public class IphonePhoneBuilder extends PhoneBuilder {

    private  Phone phone=new Phone();

    public void builderScreen(String screen) {
        phone.setScreen(screen);

    }

    public void buildCamera(String camrea) {
        phone.setScreen(camrea);

    }

    public void buildCpu(String cpu) {
        phone.setScreen(cpu);

    }

    /**
     * 特定的系统
     */
    public void buildSystem() {
        phone.setSystem("ios");
    }

    public Phone create() {
        return phone;
    }
}
