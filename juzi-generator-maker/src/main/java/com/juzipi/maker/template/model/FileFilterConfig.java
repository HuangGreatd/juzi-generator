package com.juzipi.maker.template.model;

import lombok.Builder;
import lombok.Data;

/**
 * 文件过滤配置
 *
 * @author juzipi
 * @date 2024/4/23 19:47
 */
@Data
@Builder
public class FileFilterConfig {

    /**
     * 过滤范围
     */
    private String range;

    /**
     * 过滤规则
     */
    private String rule;

    /**
     * 过滤值
     */
    private String value;
}
