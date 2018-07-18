package com.sunjie.builder;

public abstract class PhoneBuilder {

    public abstract void builderScreen(String screen);
    public abstract void buildCamera(String camrea);
    public abstract void buildCpu(String cpu);
    public abstract void buildSystem();

    /**
     * 获得我们建造的Product对象
     * @return
     */
    public abstract Phone create();

}
