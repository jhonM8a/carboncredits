package org.jochoa.controllers.imp;

import org.jochoa.DAO.DrawablesDao;
import org.jochoa.constants.Constant;
import org.jochoa.controllers.IControllerShape;
import org.jochoa.drawable.DrawableCircle;
import org.jochoa.drawable.DrawableSquare;
import org.jochoa.models.Circle;
import org.jochoa.models.Point;
import org.jochoa.models.Shape;
import org.jochoa.views.ImagePanel;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class CircleController extends ShapeController implements IControllerShape {

    @Override
    public void setDataAndDraw(Point pointStart, MouseEvent e, ImagePanel imagePanel, DrawablesDao drawablesDao) {
        super.incrementCount();
        Integer inputValueRadius = super.getValueRequest(e, Constant.MESSAGE_RADIUS);
        Circle circle = new Circle(pointStart,inputValueRadius);
        DrawableCircle drawableCircle = new DrawableCircle(circle);
        drawablesDao.add(drawableCircle);
        imagePanel.setDrawables(drawablesDao);
        imagePanel.setCount(super.getCount());
        super.setColorAndRepaint(circle, imagePanel);
    }


}
