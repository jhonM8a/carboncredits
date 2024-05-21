package org.jochoa.models;

public class Line extends Shape{
    Point end;

    public Line( Point start,Point end) {
        super(start);
        this.end = end;
    }

    public int perimeter(){
        return end.getX() - start.getX();
    }
    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }


}
