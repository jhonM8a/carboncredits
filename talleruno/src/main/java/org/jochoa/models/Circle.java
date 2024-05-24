package org.jochoa.models;

public class Circle  extends Shape{
    private int radius;
    public Circle(Point start, int radius){
        super(start);
        this.radius = radius;
    }

    public Integer getDiameter(){
        return radius*2;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


}
