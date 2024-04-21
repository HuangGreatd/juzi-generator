package com.juzipi.maker.meta;

/**
 * @author juzipi
 * @date 2024/4/21 13:30
 */
public class MetaException extends RuntimeException{
    public MetaException(String message) {
        super(message);
    }

    public MetaException(String message, Throwable cause) {
        super(message, cause);
    }
}
