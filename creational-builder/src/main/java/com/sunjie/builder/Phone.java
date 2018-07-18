package com.sunjie.builder;

/**
 * 需要构建的产品
 */
public class Phone {

    private String cpu;
    private String camera;
    private String screen;
    private String system;

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

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", camera='" + camera + '\'' +
                ", screen='" + screen + '\'' +
                ", system='" + system + '\'' +
                '}';
    }
}
