package com.juzipi.maker.model;

import lombok.Data;

/**
 * 用于生成核心模板文件
 *
 * @author juzipi
 * @date 2024/4/21 15:58
 */
@Data
public class MainTemplate {

    /**
     * 作者注释
     */
    private String author = "juzipi";

    /**
     * 输出信息
     */
    private String outputText = "sum=";
}
