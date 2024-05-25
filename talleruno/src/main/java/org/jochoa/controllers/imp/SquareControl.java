package org.jochoa.controllers.imp;

import org.jochoa.models.Square;

import java.awt.event.MouseEvent;

public class SquareControl {
    Square square;
    MouseEvent event;
    int squaresCount;


    public SquareControl(Square square, MouseEvent event) {
        this.square = square;
        this.event = event;
        this.squaresCount = 0;
    }

    public void draw() {
        if(squaresCount == 1 || squaresCount ==2 ){
            event.getComponent().repaint();
        } else if (squaresCount >2) {
            squaresCount = 0;
        }
    }

    public void addCountSquare(){
        this.squaresCount=+1;
    }

    public int getSquaresCount() {
        return squaresCount;
    }
}
