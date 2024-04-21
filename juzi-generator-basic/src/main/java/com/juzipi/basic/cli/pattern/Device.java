package com.juzipi.basic.cli.pattern;

/**
 * 命令模式-被遥控的设备
 *
 * @author juzipi
 * @date 2024/4/20 10:23
 */
public class Device {
    private String name;

    public Device(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println(name + " 设备打开");
    }

    public void turnOff() {
        System.out.println(name + " 设备关闭");
    }
}
