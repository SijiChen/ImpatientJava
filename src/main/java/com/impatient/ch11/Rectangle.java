package com.impatient.ch11;

/**
 * Created by sjchen on 8/12/16.
 */
@ToString
public class Rectangle {
    @ToString(includeName = false) private Point topLeft;
    @ToString private int width;
    @ToString private int height;

    public Rectangle(Point topLeft, int width, int height) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }
}
