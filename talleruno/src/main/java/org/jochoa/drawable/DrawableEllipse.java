package org.jochoa.drawable;

import org.jochoa.models.Ellipse;
import org.jochoa.models.Shape;

import java.awt.*;

public class DrawableEllipse implements IDrawable{

    Ellipse ellipse;

    public DrawableEllipse(Ellipse ellipse){
        this.ellipse = ellipse;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(ellipse.getColor() == 1? Color.BLUE: Color.RED);
        graphics.drawOval(ellipse.getStart().getX(), ellipse.getStart().getY(), ellipse.getMinorAxis(), ellipse.getMajorAxis());

    }
}
