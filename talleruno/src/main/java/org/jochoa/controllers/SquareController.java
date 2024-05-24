package org.jochoa.controllers;

import org.jochoa.constants.Constant;
import org.jochoa.models.Circle;
import org.jochoa.models.Point;
import org.jochoa.models.Shape;
import org.jochoa.models.Square;
import org.jochoa.views.ImagePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class SquareController {
    private Point pointStartClickToSquare;

    private String nameShape;

    private int count = 0;

    private Square square;

    private Circle circle;

    public void mouseclickerdSquare(MouseEvent mouseEvent, ImagePanel imagePanel){
        pointStartClickToSquare = new Point();
        pointStartClickToSquare.setX(mouseEvent.getX());
        pointStartClickToSquare.setY(mouseEvent.getY());

        if(imagePanel.getNameShape() !=null && imagePanel.getNameShape().equals("square")){
            count = count + 1;
            Integer inputValue  = this.getValueRequest(mouseEvent,Constant.MESSAGE_SIDE_SQUARE);
            square = new Square(pointStartClickToSquare,inputValue);
            imagePanel.setCount(count);

            if(count == 1){
                square.setColor(Color.BLUE);
                imagePanel.addSquareList(square);
                imagePanel.repaint();
            } else if (count==2) {
                count = 0;
                square.setColor(Color.RED);
                imagePanel.addSquareList(square);
                imagePanel.repaint();

            }
        } else if (imagePanel.getNameShape() !=null && imagePanel.getNameShape().equals("circle")) {
            count = count + 1;
            Integer inputValue  = this.getValueRequest(mouseEvent,Constant.MESSAGE_RADIUS);
            circle = new Circle(pointStartClickToSquare, inputValue);
            imagePanel.setCount(count);
            if(count == 1){
                circle.setColor(Color.BLUE);
                imagePanel.addCirculeList(circle);
                imagePanel.repaint();

            } else if (count == 2) {

                circle.setColor(Color.RED);
                imagePanel.addCirculeList(circle);
                imagePanel.repaint();
                count = 0;

            }
        }
    }


    private Integer getValueRequest(MouseEvent mouseEvent, String messageRequest){
        return Integer.parseInt(JOptionPane.showInputDialog(mouseEvent.getComponent(), messageRequest));
    }
    public String getNameShape() {
        return nameShape;
    }

    public void setNameShape(String nameShape) {
        this.nameShape = nameShape;
    }
}
