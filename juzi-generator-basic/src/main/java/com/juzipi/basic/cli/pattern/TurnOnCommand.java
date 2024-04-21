package com.juzipi.basic.cli.pattern;

/**
 * 命令模式-具体某个按钮制作
 *
 * @author juzipi
 * @date 2024/4/20 10:22
 */
public class TurnOnCommand implements Command {
    private Device device;

    public TurnOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
