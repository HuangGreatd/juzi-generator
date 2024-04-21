package com.juzipi.maker.meta.enums;

/**
 * @author juzipi
 * @date 2024/4/21 13:42
 */
public enum FileTypeEnum {
    DIR("目录", "dir"),
    GROUP("文件组", "group"),
    FILE("文件", "file");

    private final String text;

    private final String value;

    FileTypeEnum(String text, String value) {
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
