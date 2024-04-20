package com.juzipi.basic.model;

import lombok.Data;

/**
 * @author juzipi
 * @date 2024/4/19 20:46
 */
@Data
public class MainTemplateConfig {
    /**
     * 是否生成循环
     */
    private boolean loop;

    /**
     * 作者注释
     */
    private String author = "juzipi";

    /**
     * 输出信息
     */
    private String outputText = "sum=";
}
