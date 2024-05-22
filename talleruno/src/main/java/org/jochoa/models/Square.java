package org.jochoa.models;

import java.awt.*;

public class Square extends Shape{
    private int side;

    private Color color;
    public Square(Point start, int side) {
        super(start);
        this.side = side;
    }
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
