package org.jochoa.controllers.imp;

import org.jochoa.DAO.DrawablesDao;
import org.jochoa.constants.Constant;
import org.jochoa.controllers.IControllerShape;
import org.jochoa.drawable.DrawableSquare;
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
    public void setDataAndDraw(Point pointStart, MouseEvent e, ImagePanel imagePanel, DrawablesDao drawablesDao) {
        super.incrementCount();
        Integer inputValueSide = super.getValueRequest(e, Constant.MESSAGE_SIDE_SQUARE);
        Square square = new Square(pointStart, inputValueSide);
        DrawableSquare drawableSquare = new DrawableSquare(square);
        drawablesDao.add(drawableSquare);
        imagePanel.setDrawables(drawablesDao);
        imagePanel.setCount(super.getCount());
        super.setColorAndRepaint(square, imagePanel);

    }
}
