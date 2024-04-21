package com.juzipi.basic.cli.pattern;

/**
 * 命令模式-使用遥控器的人
 *
 * @author juzipi
 * @date 2024/4/20 10:26
 */
public class Client {
    public static void main(String[] args) {
        Device tv = new Device("TV");
        Device stereo = new Device("Stereo");
        // 创建具体命令对象，可以绑定不同设备
        TurnOnCommand turnOn = new TurnOnCommand(tv);
        TurnOffCommand turnOff = new TurnOffCommand(stereo);

        // 创建调用者
        RemoteControl remote = new RemoteControl();

        // 执行命令
        remote.setCommand(turnOn);
        remote.pressButton();

        remote.setCommand(turnOff);
        remote.pressButton();

    }
}
