package org.jochoa.models;

import java.awt.*;

public class Square extends Shape{
    private int side;


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


}
