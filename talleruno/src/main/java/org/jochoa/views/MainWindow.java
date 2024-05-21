package org.jochoa.views;

import org.jochoa.models.Line;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    MainPanel mainPanel;
    Line[] lines;
    public MainWindow(MainPanel mainPanel) {
        this.mainPanel = mainPanel;
        setTitle("Dibujar");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
        add(this.mainPanel, BorderLayout.CENTER);
    }


}