package com.juzipi.maker.meta.enums;

/**
 * 模型类型枚举
 *
 * @author juzipi
 * @date 2024/4/21 13:42
 */
public enum ModelTypeEnum {
    STRING("字符串", "String"),
    BOOLEAN("布尔", "boolean");

    private final String text;

    private final String value;

    ModelTypeEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public String getValue() {
        return value;
    }
}
