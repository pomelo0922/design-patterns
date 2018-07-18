package com.sunjie.builder;

public class Director {

    private PhoneBuilder builder;

    public Director(PhoneBuilder builder){
        this.builder=builder;
    }

    public void construct(String camera,String screen,String cpu){
        builder.buildCamera(camera);
        builder.builderScreen(screen);
        builder.buildCpu(cpu);
    }

}
