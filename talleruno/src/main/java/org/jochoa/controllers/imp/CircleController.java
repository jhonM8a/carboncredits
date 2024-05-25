package org.jochoa.controllers.imp;

import org.jochoa.constants.Constant;
import org.jochoa.controllers.IControllerShape;
import org.jochoa.models.Circle;
import org.jochoa.models.Point;
import org.jochoa.models.Shape;
import org.jochoa.views.ImagePanel;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class CircleController extends ShapeController implements IControllerShape {
    @Override
    public void draw(Shape shape, Point start, MouseEvent e, ImagePanel imagePanel) {
        if(shape instanceof Circle){
            super.incrementCount();
            Circle circle = (Circle) shape;
            Integer inputValueRadius = super.getValueRequest(e, Constant.MESSAGE_RADIUS);
            circle.setStart(start);
            circle.setRadius(inputValueRadius);
            imagePanel.setCount(super.getCount());
            super.setColorAndRepaint(circle, imagePanel);

        }
    }


}
