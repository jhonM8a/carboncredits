package org.jochoa.views;

import org.jochoa.actions.*;
import org.jochoa.actions.Action;
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

    ActionsEllipse actionsEllipse;

    ActionRectangle actionRectangle;

    ActionSaveData actionSaveData;

    BufferedImage image;
    public  MainPanel(ImagePanel imagePanel){
        setSize(1200,800);

        this.actionImage = new ActionImage(imagePanel);
        this.actionSquare = new ActionSquare(imagePanel);
        this.actionCircle = new ActionCircle(imagePanel);
        this.actionsEllipse = new ActionsEllipse(imagePanel);
        this.actionRectangle = new ActionRectangle(imagePanel);
        this.actionSaveData = new ActionSaveData(imagePanel);

        JButton buttonCircle = new JButton("Add Circle");
        JButton buttonSquare = new JButton("Add Square");
        JButton myButton = new JButton("Add Image");
        JButton buttonEllipse = new JButton("Add Ellipse");
        JButton buttonRectangle = new JButton("Add rectangle");
        JButton buttonSave = new JButton("Save");


        myButton.addActionListener(actionImage);
        buttonSquare.addActionListener(actionSquare);
        buttonCircle.addActionListener(actionCircle);
        buttonEllipse.addActionListener(actionsEllipse);
        buttonRectangle.addActionListener(actionRectangle);
        buttonSave.addActionListener(actionSaveData);

        add(myButton);
        add(buttonCircle);
        add(buttonSquare);
        add(buttonEllipse);
        add(buttonRectangle);
        add(buttonSave);

    }
}
