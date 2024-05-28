package org.jochoa.controllers.imp;

import org.jochoa.DAO.DrawablesDao;
import org.jochoa.constants.Constant;
import org.jochoa.controllers.IControllerShape;
import org.jochoa.drawable.DrawableRectangle;
import org.jochoa.drawable.DrawableSquare;
import org.jochoa.models.Point;
import org.jochoa.models.Rectangle;
import org.jochoa.models.Square;
import org.jochoa.views.ImagePanel;

import java.awt.event.MouseEvent;

public class RectangleController extends ShapeController implements IControllerShape {
    @Override
    public void setDataAndDraw(Point pointStart, MouseEvent e, ImagePanel imagePanel, DrawablesDao drawablesDao) {
        super.incrementCount();
        Integer inputValueHeight = super.getValueRequest(e, Constant.MESSAGE_SIDE_HEIGHT);
        Integer inputValueWidth = super.getValueRequest(e, Constant.MESSAGE_SIDE_WIDTH);

        Rectangle rectangle = new Rectangle(pointStart,inputValueHeight,inputValueWidth);
        DrawableRectangle drawableRectangle = new DrawableRectangle(rectangle);
        drawablesDao.add(drawableRectangle);
        imagePanel.setDrawables(drawablesDao);
        imagePanel.setCount(super.getCount());
        super.setColorAndRepaint(rectangle, imagePanel);
    }
}
