package com.juzipi.maker.generator.file;

import com.juzipi.maker.model.DataModel;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * @author juzipi
 * @date 2024/4/19 20:58
 */
public class FileGenerator {

    public static void doGenerate(Object model) throws TemplateException, IOException {
        String projectPath = System.getProperty("user.dir");

        File parentFile = new File(projectPath).getParentFile();

        String inputPath = new File(parentFile, "juzi-generator-demo-projects/acm-template").getAbsolutePath();
        String outputPath = projectPath;

        StaticFileGenerator.copyFilesByHutool(inputPath,outputPath);

        String inputDynamicFilePath = projectPath + File.separator + "src/main/resources/templates/MainTemplate.java.ftl";
        String outputDynamicFilePath = outputPath + File.separator + "acm-template/src/com/juzipi/acm/MainTemplate.java";
        DynamicFileGenerator.doGenerate(inputDynamicFilePath,outputDynamicFilePath,model);


    }

    public static void main(String[] args) throws TemplateException, IOException {
        DataModel dataModel = new DataModel();
        dataModel.setAuthor("yupi");
        dataModel.setLoop(false);
        dataModel.setOutputText("求和结果：");
        doGenerate(dataModel);
    }
}
