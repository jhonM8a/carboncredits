package org.jochoa.actions;

import org.jochoa.constants.Constant;
import org.jochoa.views.ImagePanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Action implements ActionListener {

    private ImagePanel imagePanel;

    public Action(ImagePanel imagePanel){
        this.imagePanel = imagePanel;
    }
    @Override
    public abstract void actionPerformed(ActionEvent e);

    public ImagePanel getImagePanel() {
        return imagePanel;
    }

    public void showMessageRequestInput(String message){
        JOptionPane.showMessageDialog(this.imagePanel, message);

    }
}
