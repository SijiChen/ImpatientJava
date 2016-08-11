package com.impatient.ch05;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by sjchen on 8/11/16.
 */
public class StackTraceDemo {
    public static void bad() {
        System.out.println(1 / 0);
    }

    public static void main(String[] args) {
        try {
            bad();
        } catch (Exception ex) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ex.printStackTrace(new PrintStream(out));
            String description = out.toString();
            System.out.println("The stack trace in a string: " + description.replaceAll("\\s+", " "));
        }

        try {
            bad();
        } catch (Exception ex) {
            StackTraceElement[] frames = ex.getStackTrace();
            for (StackTraceElement frame : frames)
                System.out.println("Frame: " + frame);
        }

        try {
            bad();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
