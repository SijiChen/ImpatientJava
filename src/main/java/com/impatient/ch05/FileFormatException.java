package com.impatient.ch05;

import java.io.IOException;

/**
 * Created by sjchen on 8/11/16.
 */
public class FileFormatException extends IOException {
    public FileFormatException() {
    }

    public FileFormatException(String message) {
        super(message);
    }
}
