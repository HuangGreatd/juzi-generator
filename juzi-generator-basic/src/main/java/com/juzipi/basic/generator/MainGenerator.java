package com.juzipi.basic.generator;

import com.juzipi.basic.model.MainTemplateConfig;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * 核心代码生成器
 *
 * @author juzipi
 * @date 2024/4/19 20:58
 */
public class MainGenerator {

    /**
     * 生成
     *
     * @param model
     * @throws TemplateException
     * @throws IOException
     */
    public static void doGenerate(Object model) throws TemplateException, IOException {
        String inputRootPath = "D:\\code\\mycode\\juzi-generator\\juzi-generator-demo-projects\\acm-template-pro";
        String outputRootPath = "D:\\code\\mycode\\juzi-generator\\\\acm-template-pro";


        String inputPath;
        String outputPath;


        inputPath = new File(inputRootPath, "src/com/juzipi/acm/MainTemplate.java.ftl").getAbsolutePath();
        outputPath = new File(outputRootPath, "src/com/juzipi/acm/MainTemplate.java").getAbsolutePath();
        DynamicGenerator.doGenerate(inputPath, outputPath, model);


        inputPath = new File(inputRootPath, ".gitignore").getAbsolutePath();
        outputPath = new File(outputRootPath, ".gitignore").getAbsolutePath();
        StaticGenerator.copyFilesByHutool(inputPath, outputPath);

        inputPath = new File(inputRootPath, "README.md").getAbsolutePath();
        outputPath = new File(outputRootPath, "README.md").getAbsolutePath();
        StaticGenerator.copyFilesByHutool(inputPath, outputPath);



    }

    public static void main(String[] args) throws TemplateException, IOException {
        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        mainTemplateConfig.setAuthor("yupi");
        mainTemplateConfig.setLoop(false);
        mainTemplateConfig.setOutputText("求和结果：");
        doGenerate(mainTemplateConfig);
    }
}
