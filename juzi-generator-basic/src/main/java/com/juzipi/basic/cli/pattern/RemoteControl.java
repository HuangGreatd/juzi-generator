package com.juzipi.basic.cli.pattern;

/**
 * 命令模式-遥控器
 *
 * @author juzipi
 * @date 2024/4/20 10:25
 */
public class RemoteControl {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}
