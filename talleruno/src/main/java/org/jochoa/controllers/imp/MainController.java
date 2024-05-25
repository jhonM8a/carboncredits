package org.jochoa.controllers.imp;

import org.jochoa.constants.Constant;
import org.jochoa.models.Circle;
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

    public MainController(){}
    public void dibujar(){
        SquareController squareController = new SquareController();
        CircleController circleController = new CircleController();

        ImagePanel imagePanel = new ImagePanel();


        mainPanel = new MainPanel(imagePanel);

        imagePanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(imagePanel.getNameShape() == null && imagePanel.getImage() == null){
                    JOptionPane.showMessageDialog(e.getComponent(), "Plesea select first a image");

                } else if (imagePanel.getNameShape() == null && imagePanel.getImage() != null) {
                    JOptionPane.showMessageDialog(e.getComponent(), "Plesea select a type of shape");

                } else if (imagePanel.getNameShape().equals("square") /*|| imagePanel.getNameShape().equals("circle")*/) {
                    Square square = new Square(new Point(0,0),0);
                    Point pointStart = new Point();
                    pointStart.setX(e.getX());
                    pointStart.setY(e.getY());
                    squareController.draw(square, pointStart, e, imagePanel);

                } else if (imagePanel.getNameShape().equals(Constant.CIRCLE)) {
                    Circle circle = new Circle(new Point(0,0),0);
                    Point pointStart = new Point();
                    pointStart.setX(e.getX());
                    pointStart.setY(e.getY());
                    circleController.draw(circle, pointStart, e, imagePanel);
                }


            }
        });

        mainWindow = new MainWindow(mainPanel);

        mainWindow.add(imagePanel);
        mainWindow.setVisible(true);



    }

}

