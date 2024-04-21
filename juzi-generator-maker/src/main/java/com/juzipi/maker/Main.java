package com.juzipi.maker;

import com.juzipi.maker.generator.main.MainGenerator;
import freemarker.template.TemplateException;

import java.io.IOException;

/**
 * 模板方法-调用具体子类
 *
 * @author juzipi
 * @date 2024/4/19 20:20
 */
public class Main {
    public static void main(String[] args) throws TemplateException, IOException, InterruptedException {
        MainGenerator mainGenerator = new MainGenerator();
        mainGenerator.doGenerate();
    }
}