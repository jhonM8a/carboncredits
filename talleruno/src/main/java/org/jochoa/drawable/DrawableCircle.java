package org.jochoa.drawable;

import org.jochoa.models.Circle;

import java.awt.*;

public class DrawableCircle implements IDrawable{
    Circle circle;

    public DrawableCircle(Circle circle){
        this.circle = circle;
    }

    @Override
    public void draw(Graphics graphics) {

        graphics.setColor(circle.getColor() == 1? Color.BLUE : Color.RED );
        graphics.drawOval(circle.getStart().getX() - circle.getRadius(), circle.getStart().getY() - circle.getRadius(), circle.getDiameter(), circle.getDiameter());

    }

}
