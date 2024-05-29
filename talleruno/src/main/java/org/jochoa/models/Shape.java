package org.jochoa.models;

import java.awt.*;

public class Shape {
    Point start;
    private Integer color;

    public Shape(Point start) {
        this.start = start;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }
}
