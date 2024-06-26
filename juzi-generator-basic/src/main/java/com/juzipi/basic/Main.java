package com.juzipi.basic;

import com.juzipi.basic.cli.CommandExecutor;
import com.juzipi.basic.model.MainTemplateConfig;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

import static com.juzipi.basic.generator.DynamicGenerator.doGenerate;
import static com.juzipi.basic.generator.StaticGenerator.copyFilesByHutool;

/**
 * @author juzipi
 * @date 2024/4/19 20:20
 */
public class Main {
    public static void main(String[] args) throws TemplateException, IOException {
//        String projectPath = System.getProperty("user.dir");
//        String inputPath = projectPath + File.separator + "src/main/resources/templates/MainTemplate.java.ftl";
//        String outputPath = projectPath + File.separator + "MainTemplate.java";
//        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
//        mainTemplateConfig.setAuthor("yupi");
//        mainTemplateConfig.setLoop(false);
//        mainTemplateConfig.setOutputText("求和结果：");
//        doGenerate(inputPath, outputPath, mainTemplateConfig);
        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.doExecute(args);

    }
}