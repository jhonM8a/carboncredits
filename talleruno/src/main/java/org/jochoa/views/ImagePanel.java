package org.jochoa.views;

import org.jochoa.models.Circle;
import org.jochoa.models.Point;
import org.jochoa.models.Shape;
import org.jochoa.models.Square;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class ImagePanel extends JPanel {
    private BufferedImage image;
    Point pointStartClick;

    private String nameShape;

    List<Square> squareList = new ArrayList<>();

    List<Circle> circleList = new ArrayList<>();

    List<Shape> shapeList = new ArrayList<>();

    private int count = 0;
    public ImagePanel(){}



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (image != null) {
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
        if(nameShape != null){


            if(shapeList !=null && count<=2){
                for (Shape shape: shapeList) {
                    if(shape instanceof Circle){
                        Circle circle = (Circle) shape;
                        g.setColor(shape.getColor());
                        g.drawOval(circle.getStart().getX() - circle.getRadius(), circle.getStart().getY() - circle.getRadius(), circle.getDiameter(), circle.getDiameter());

                    } else if (shape instanceof  Square) {
                        Square square = (Square) shape;
                        g.setColor(square.getColor());
                        g.drawRect(square.getStart().getX(), square.getStart().getY(), square.getSide(), square.getSide());
                    }
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

    public void addShapeToList(org.jochoa.models.Shape shape){
        this.shapeList.add(shape);
    }

    public void setCount(int count) {
        this.count = count;
    }

    public BufferedImage getImage() {
        return image;
    }

}
