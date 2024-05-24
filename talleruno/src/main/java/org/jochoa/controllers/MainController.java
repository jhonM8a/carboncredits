package org.jochoa.controllers;

import org.jochoa.models.Line;
import org.jochoa.models.Point;
import org.jochoa.models.Shape;
import org.jochoa.models.Square;
import org.jochoa.views.ImagePanel;
import org.jochoa.views.MainPanel;
import org.jochoa.views.MainWindow;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class MainController {
    MainWindow mainWindow;
    MainPanel mainPanel;

    public MainController(){}
    public void dibujar(){
        SquareController squareController = new SquareController();
        //Panel para imagen
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

                } else if (imagePanel.getNameShape().equals("square") || imagePanel.getNameShape().equals("circle")) {
                    System.out.println("controller:"+imagePanel.getNameShape());
                    squareController.mouseclickerdSquare(e, imagePanel);
                }


            }
        });

        mainWindow = new MainWindow(mainPanel);

        mainWindow.add(imagePanel);
        mainWindow.setVisible(true);



    }

}

