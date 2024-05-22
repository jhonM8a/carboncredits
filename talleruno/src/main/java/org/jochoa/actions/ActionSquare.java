package org.jochoa.actions;

import org.jochoa.constants.Constant;
import org.jochoa.views.ImagePanel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ActionSquare extends Action{

    private ImagePanel imagePanel;

    public ActionSquare(ImagePanel imagePanel){
        this.imagePanel = imagePanel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        imagePanel.setNameShape("square");
        JOptionPane.showMessageDialog(imagePanel, Constant.MESSAGE_SQUARE);

    }
}
