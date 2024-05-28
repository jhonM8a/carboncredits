package org.jochoa.actions;

import org.jochoa.constants.Constant;
import org.jochoa.views.ImagePanel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ActionCircle extends Action{
    public ActionCircle(ImagePanel imagePanel) {
        super(imagePanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.getImagePanel().setNameShape(Constant.CIRCLE);
        super.showMessageRequestInput(Constant.MESSAGE_CIRCULE_RADIUS);



    }
}
