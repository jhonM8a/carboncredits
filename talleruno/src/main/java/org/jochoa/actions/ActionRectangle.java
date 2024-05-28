package org.jochoa.actions;

import org.jochoa.constants.Constant;
import org.jochoa.views.ImagePanel;

import java.awt.event.ActionEvent;

public class ActionRectangle extends  Action{
    public ActionRectangle(ImagePanel imagePanel) {
        super(imagePanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.getImagePanel().setNameShape(Constant.RECTANGLE);
        super.showMessageRequestInput(Constant.MESSAGE_RECTANGLE_WITH_HIGHT);
    }
}
