package org.jochoa.models;

import java.awt.*;

public class Shape {
    Point start;
    private Color color;

    public Shape(Point start) {
        this.start = start;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
