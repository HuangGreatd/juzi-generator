package com.juzipi.maker.generator.main;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.util.StrUtil;
import com.juzipi.maker.generator.JarGenerator;
import com.juzipi.maker.generator.ScriptGenerator;
import com.juzipi.maker.generator.file.DynamicFileGenerator;
import com.juzipi.maker.meta.Meta;
import com.juzipi.maker.meta.MetaManager;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * 模板方法-具体子类
 *
 * @author juzipi
 * @date 2024/4/21 10:37
 */
public class MainGenerator extends GenerateTemplate {

    @Override
    public void doGenerate() throws TemplateException, IOException, InterruptedException {
        super.doGenerate();
    }
}
