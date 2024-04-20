package com.juzipi.basic.generator;

import com.juzipi.basic.model.MainTemplateConfig;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * @author juzipi
 * @date 2024/4/19 20:58
 */
public class MainGenerator {

    public static void doGenerate(Object model) throws TemplateException, IOException {
        String projectPath = System.getProperty("user.dir");

        File parentFile = new File(projectPath).getParentFile();

        String inputPath = new File(parentFile, "juzi-generator-demo-projects/acm-template").getAbsolutePath();
        String outputPath = projectPath;

        StaticGenerator.copyFilesByRecursive(inputPath,outputPath);

        String inputDynamicFilePath = projectPath + File.separator + "src/main/resources/templates/MainTemplate.java.ftl";
        String outputDynamicFilePath = outputPath + File.separator + "acm-template/src/com/juzipi/acm/MainTemplate.java";
        DynamicGenerator.doGenerate(inputDynamicFilePath,outputDynamicFilePath,model);


    }

    public static void main(String[] args) throws TemplateException, IOException {
        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        mainTemplateConfig.setAuthor("yupi");
        mainTemplateConfig.setLoop(false);
        mainTemplateConfig.setOutputText("求和结果：");
        doGenerate(mainTemplateConfig);
    }
}
