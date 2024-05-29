package org.jochoa.controllers.imp;

import org.jochoa.DAO.DrawablesDao;
import org.jochoa.constants.Constant;
import org.jochoa.models.Circle;
import org.jochoa.models.Ellipse;
import org.jochoa.models.Point;
import org.jochoa.models.Square;
import org.jochoa.views.ImagePanel;
import org.jochoa.views.MainPanel;
import org.jochoa.views.MainWindow;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainController {
    MainWindow mainWindow;
    MainPanel mainPanel;

    DrawablesDao drawablesDao;

    public MainController(){}
    public void dibujar(){
        SquareController squareController = new SquareController();
        CircleController circleController = new CircleController();
        EllipseController ellipseController = new EllipseController();
        RectangleController rectangleController = new RectangleController();

       if(drawablesDao==null){
           DrawablesDao drawablesDao = new DrawablesDao();
           this.drawablesDao = drawablesDao;
       }


        ImagePanel imagePanel = new ImagePanel();


        mainPanel = new MainPanel(imagePanel);

        imagePanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Point pointStart = new Point();
                pointStart.setX(e.getX());
                pointStart.setY(e.getY());

                if(imagePanel.getNameShape() == null && imagePanel.getImage() == null){
                    JOptionPane.showMessageDialog(e.getComponent(), Constant.MESSAGE_IMAGE_FIRST);

                } else if (imagePanel.getNameShape() == null && imagePanel.getImage() != null) {
                    JOptionPane.showMessageDialog(e.getComponent(), Constant.MESSAGE_FRIST_SELECT_SHAPE);

                } else if (imagePanel.getNameShape().equals(Constant.SQUARE)) {
                    squareController.setDataAndDraw(pointStart,e,imagePanel,drawablesDao);

                } else if (imagePanel.getNameShape().equals(Constant.CIRCLE)) {
                    circleController.setDataAndDraw(pointStart, e, imagePanel,drawablesDao);

                } else if (imagePanel.getNameShape().equals(Constant.ELLIPSE)) {
                    ellipseController.setDataAndDraw(pointStart,e,imagePanel,drawablesDao);

                } else if (imagePanel.getNameShape().equals(Constant.RECTANGLE)) {
                    rectangleController.setDataAndDraw(pointStart,e,imagePanel,drawablesDao);
                }


            }
        });

        mainWindow = new MainWindow(mainPanel);

        mainWindow.add(imagePanel);
        mainWindow.setVisible(true);



    }

}

