package org.jochoa.drawable;

import org.jochoa.models.Rectangle;

import java.awt.*;

public class DrawableRectangle implements IDrawable{
    Rectangle rectangle;

    public DrawableRectangle(Rectangle rectangle){
        this.rectangle = rectangle;
    }
    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(rectangle.getColor());
        graphics.drawRect(rectangle.getStart().getX(), rectangle.getStart().getY(), rectangle.getWidth(), rectangle.getHeight());
    }
}
