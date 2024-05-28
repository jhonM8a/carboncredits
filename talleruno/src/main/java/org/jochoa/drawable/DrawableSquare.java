package org.jochoa.drawable;

import org.jochoa.models.Square;

import java.awt.*;

public class DrawableSquare implements IDrawable{
    private Square square;

    public DrawableSquare(Square square){
        this.square = square;
    }
    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(square.getColor());
        graphics.drawRect(square.getStart().getX(), square.getStart().getY(), square.getSide(), square.getSide());
    }
}
