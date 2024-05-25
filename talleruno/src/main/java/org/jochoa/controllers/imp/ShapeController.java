package org.jochoa.controllers.imp;

import org.jochoa.models.Shape;
import org.jochoa.views.ImagePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class ShapeController {

    private int count = 0;
    public  Integer getValueRequest(MouseEvent e, String message){
        return Integer.parseInt(JOptionPane.showInputDialog(e.getComponent(), message));

    }

    protected void setColorAndRepaint(Shape shape, ImagePanel imagePanel) {

        if(this.count ==1 ){
            shape.setColor(Color.BLUE);
            imagePanel.addShapeToList(shape);
            imagePanel.repaint();
        } else if (this.count == 2 ) {
            shape.setColor(Color.RED);
            imagePanel.addShapeToList(shape);
            imagePanel.repaint();
            this.count = 0;
        }
    }
    public void incrementCount(){
        count = count +1;
    }

    public int getCount(){
        return count;
    }

}
