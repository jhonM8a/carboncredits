package org.jochoa.controllers.imp;

import org.jochoa.DAO.DrawablesDao;
import org.jochoa.constants.Constant;
import org.jochoa.controllers.IControllerShape;
import org.jochoa.drawable.DrawableEllipse;
import org.jochoa.models.Ellipse;
import org.jochoa.models.Point;
import org.jochoa.models.Shape;
import org.jochoa.views.ImagePanel;

import java.awt.event.MouseEvent;

public class EllipseController extends ShapeController implements IControllerShape {

    public void setDataAndDraw(Point pointStart, MouseEvent e, ImagePanel imagePanel, DrawablesDao drawablesDao){
        super.incrementCount();

        Integer inputValueMajoraxis = super.getValueRequest(e, Constant.MESSAGE_ELLIPSE_REQUEST_MAJOR_AXIS);
        Integer inputValueMinorxis = super.getValueRequest(e, Constant.MESSAGE_ELLIPSE_REQUEST_MINOR_AXIS);
        Ellipse ellipse = new Ellipse(pointStart, inputValueMajoraxis, inputValueMinorxis);



        ellipse.setMajorAxis(inputValueMajoraxis);
        ellipse.setMajorAxis(inputValueMinorxis);

        DrawableEllipse drawableEllipse = new DrawableEllipse(ellipse);
        drawablesDao.add(drawableEllipse);

        imagePanel.setDrawables(drawablesDao);


        imagePanel.setCount(super.getCount());
        super.setColorAndRepaint(ellipse, imagePanel);
    }
}
