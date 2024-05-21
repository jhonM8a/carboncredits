package org.jochoa.views;

import org.jochoa.actions.Action;
import org.jochoa.actions.ActionImage;
import org.jochoa.models.Line;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MainPanel extends JPanel{

    Line[] lines;

    ActionImage actionImage;

    BufferedImage image;
    public  MainPanel(ImagePanel imagePanel){
        this.actionImage = new ActionImage(imagePanel);
        setSize(1200,800);
        JButton myButton = new JButton("Add Image");
        myButton.addActionListener(actionImage);

        JButton buttonCircle = new JButton("Add Circle");
        JButton buttonSquare = new JButton("Add Square");
        add(myButton);
        add(buttonCircle);
        add(buttonSquare);

    }


}
