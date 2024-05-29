package org.jochoa.views;

import org.jochoa.DAO.DrawablesDao;
import org.jochoa.drawable.IDrawable;
import org.jochoa.models.*;
import org.jochoa.models.Point;
import org.jochoa.models.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class ImagePanel extends JPanel {
    private BufferedImage image;
    Point pointStartClick;

    private String nameShape;


    List<Shape> shapeList = new ArrayList<>();

   DrawablesDao drawables;

    private int count = 0;
    public ImagePanel(){}

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (image != null) {
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
        if(nameShape != null){
             if (drawables!=null && count<=2) {
                for (IDrawable drawable: drawables.getDrawables()) {
                    drawable.draw(g);
                }
            }
            if(count == 2){
                count = 0;
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

    public void addShapeToList(org.jochoa.models.Shape shape){
        this.shapeList.add(shape);
    }

    public void setDrawables(DrawablesDao drawables) {
        this.drawables = drawables;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public BufferedImage getImage() {
        return image;
    }

    public DrawablesDao getDrawables() {
        return drawables;
    }
}
