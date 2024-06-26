package com.juzipi.basic.generator;

import cn.hutool.core.io.FileUtil;
import com.juzipi.basic.model.MainTemplateConfig;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 动态文件生成
 *
 * @author juzipi
 * @date 2024/4/19 20:47
 */
public class DynamicGenerator {
    public static void main(String[] args) throws IOException, TemplateException {

    }

    public static void doGenerate(String inputPath, String outputPath, Object model) throws IOException, TemplateException {
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_32);
        File templateDir = new File(inputPath).getParentFile();
        configuration.setDirectoryForTemplateLoading(templateDir);

        configuration.setDefaultEncoding("utf-8");

        String templateName = new File(inputPath).getName();
        Template template = configuration.getTemplate(templateName);

//文件不存在则创建文件或者父目录
        if (!FileUtil.exist(outputPath)){
            FileUtil.touch(outputPath);
        }


        FileWriter out = new FileWriter(outputPath);
        template.process(model,out);

        out.close();
    }
}
