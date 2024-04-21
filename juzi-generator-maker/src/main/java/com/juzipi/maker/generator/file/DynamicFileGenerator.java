package com.juzipi.maker.generator.file;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import com.juzipi.maker.model.DataModel;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 动态文件生成
 *
 * @author juzipi
 * @date 2024/4/19 20:47
 */
public class DynamicFileGenerator {

    /**
     * 生成文件
     *
     * @param inputPath
     * @param outputPath
     * @param model
     * @throws IOException
     * @throws TemplateException
     */
    public static void doGenerate(String inputPath, String outputPath, Object model) throws IOException, TemplateException {

        inputPath = FileUtil.normalize(inputPath);
        outputPath = FileUtil.normalize(outputPath);
        if (StrUtil.isBlank(inputPath) || StrUtil.isBlank(outputPath)) {
            throw new IllegalArgumentException("inputPath or outputPath is blank");
        }
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

        Writer out = new FileWriter(outputPath);
        template.process(model, out);

        out.close();
    }
}
