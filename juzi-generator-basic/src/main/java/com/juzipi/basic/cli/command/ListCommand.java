package com.juzipi.basic.cli.command;

import cn.hutool.core.io.FileUtil;
import picocli.CommandLine;

import java.io.File;
import java.util.List;

/**
 * @author juzipi
 * @date 2024/4/20 10:29
 */
@CommandLine.Command(name =  "list",description = "查看文件列表",mixinStandardHelpOptions = true)
public class ListCommand implements Runnable{
    @Override
    public void run() {
        String projectPath = System.getProperty("user.dir");
        File parentFile = new File(projectPath).getParentFile();
        String inputPath = new File(parentFile, "juzi-generator-demo-projects/acm-template").getAbsolutePath();
        List<File> files = FileUtil.loopFiles(inputPath);
        for (File file : files) {
            System.out.println(file);
        }
    }
}
