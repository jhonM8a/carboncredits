package org.jochoa.models;

public class Ellipse extends Shape{
    private Integer majorAxis;
    private Integer minorAxis;
    public Ellipse(Point start, Integer majorAxis, Integer minorAxis) {
        super(start);
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;

    }


    public Integer getMajorAxis() {
        return majorAxis;
    }

    public void setMajorAxis(Integer majorAxis) {
        this.majorAxis = majorAxis;
    }

    public Integer getMinorAxis() {
        return minorAxis;
    }

    public void setMinorAxis(Integer minorAxis) {
        this.minorAxis = minorAxis;
    }
}
