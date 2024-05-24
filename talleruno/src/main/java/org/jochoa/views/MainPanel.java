package org.jochoa.views;

import org.jochoa.actions.Action;
import org.jochoa.actions.ActionCircle;
import org.jochoa.actions.ActionImage;
import org.jochoa.actions.ActionSquare;
import org.jochoa.models.Line;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferedImage;

public class MainPanel extends JPanel{

    Line[] lines;

    ActionImage actionImage;

    ActionSquare actionSquare;

    ActionCircle actionCircle;

    BufferedImage image;
    public  MainPanel(ImagePanel imagePanel){
        this.actionImage = new ActionImage(imagePanel);
        this.actionSquare = new ActionSquare(imagePanel);
        this.actionCircle = new ActionCircle(imagePanel);
        setSize(1200,800);
        JButton myButton = new JButton("Add Image");
        myButton.addActionListener(actionImage);

        JButton buttonCircle = new JButton("Add Circle");
        JButton buttonSquare = new JButton("Add Square");
        buttonSquare.addActionListener(actionSquare);
        buttonCircle.addActionListener(actionCircle);
        add(myButton);
        add(buttonCircle);
        add(buttonSquare);

    }
}
