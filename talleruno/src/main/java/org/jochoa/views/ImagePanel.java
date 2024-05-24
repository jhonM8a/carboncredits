package org.jochoa.views;

import org.jochoa.actions.ActionSquare;
import org.jochoa.constants.Constant;
import org.jochoa.controllers.SquareControl;
import org.jochoa.models.Circle;
import org.jochoa.models.Point;
import org.jochoa.models.Square;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ImagePanel extends JPanel {
    private BufferedImage image;
    Point pointStartClick;

    private String nameShape;

    List<Square> squareList = new ArrayList<>();

    List<Circle> circleList = new ArrayList<>();

    private int count = 0;
    public ImagePanel(){}



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("primer: "+count);
        System.out.println("shape: "+nameShape);

        if (image != null) {
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
        if(nameShape != null){
            if(squareList !=null && count<=2){
                for (Square square : squareList) {
                    g.setColor(square.getColor());
                    g.drawRect(square.getStart().getX(), square.getStart().getY(), square.getSide(), square.getSide());
                }
                if(count == 2){
                    count = 0;
                }
            }

            if(circleList !=null && count<=2){
                System.out.println(count);
                for (Circle circle : circleList) {
                    g.setColor(circle.getColor());
                    g.drawOval(circle.getStart().getX() - circle.getRadius(), circle.getStart().getY() - circle.getRadius(), circle.getDiameter(), circle.getDiameter());
                }
                if(count == 2){
                    count = 0;
                }
            }
        }


    }

    public void setBackgroundImage(BufferedImage image) {
        this.image = image;
        repaint();
    }



    public void setNameShape(String nameShape) {
        this.nameShape = nameShape;
    }

    public String getNameShape() {
        return nameShape;
    }


    public void addSquareList(Square square) {
        this.squareList.add(square);
    }

    public void addCirculeList(Circle circle) {
        this.circleList.add(circle);
    }

    public void setCount(int count) {
        this.count = count;
    }

    public BufferedImage getImage() {
        return image;
    }

}
