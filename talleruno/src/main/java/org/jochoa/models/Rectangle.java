package org.jochoa.models;

public class Rectangle extends  Shape{
    private int height;

    public Rectangle(Point start, int height, int width) {
        super(start);
        this.height = height;
        this.width = width;
    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    private int width;


}
