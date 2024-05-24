package org.jochoa.actions;

import org.jochoa.constants.Constant;
import org.jochoa.views.ImagePanel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ActionSquare extends Action{


    public ActionSquare(ImagePanel imagePanel){
        super(imagePanel);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        super.getImagePanel().setNameShape("square");
        super.showMessageRequestInput(Constant.MESSAGE_SQUARE);

    }
}
