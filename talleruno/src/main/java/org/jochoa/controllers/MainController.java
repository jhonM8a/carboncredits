package org.jochoa.controllers;

import org.jochoa.models.Line;
import org.jochoa.models.Point;
import org.jochoa.views.ImagePanel;
import org.jochoa.views.MainPanel;
import org.jochoa.views.MainWindow;

import java.util.Random;

public class MainController {
    MainWindow mainWindow;
    MainPanel mainPanel;

    public MainController(){}
    public void dibujar(){
        //Panel para imagen
        ImagePanel imagePanel = new ImagePanel();

        mainPanel = new MainPanel(imagePanel);

        mainWindow = new MainWindow(mainPanel);
        mainWindow.add(imagePanel);
        mainWindow.setVisible(true);



    }

}

