package com.juzipi.basic.cli;

import com.juzipi.basic.cli.command.ConfigCommand;
import com.juzipi.basic.cli.command.GenerateCommand;
import com.juzipi.basic.cli.command.ListCommand;
import picocli.CommandLine;

/**
 * @author juzipi
 * @date 2024/4/20 10:30
 */
@CommandLine.Command(name = "juzi", mixinStandardHelpOptions = true)
public class CommandExecutor implements Runnable {

    private final CommandLine commandLine;

    {
        commandLine = new CommandLine(this)
                .addSubcommand(new GenerateCommand())
                .addSubcommand(new ConfigCommand())
                .addSubcommand(new ListCommand());
    }

    @Override
    public void run() {
        //不输入子命令时，给出提示
        System.out.println("请输入具体命令，或者输入 --help 查看命令提示");
    }

    /**
     * 执行子命令
     *
     * @param args
     * @return
     */
    public Integer doExecute(String[] args) {
        return commandLine.execute(args);
    }
}
