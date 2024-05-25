package org.jochoa.controllers.imp;

import org.jochoa.constants.Constant;
import org.jochoa.controllers.IControllerShape;
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

public class SquareController extends ShapeController implements IControllerShape {

    @Override
    public void draw(Shape shape, Point pointStart, MouseEvent e, ImagePanel imagePanel) {
        if(shape instanceof Square){
            super.incrementCount();
            Square square = (Square) shape;
            Integer inputValueSide = super.getValueRequest(e, Constant.MESSAGE_SIDE_SQUARE);
            square.setStart(pointStart);
            square.setSide(inputValueSide);
            imagePanel.setCount(super.getCount());
            super.setColorAndRepaint(square, imagePanel);

        }
    }
}
