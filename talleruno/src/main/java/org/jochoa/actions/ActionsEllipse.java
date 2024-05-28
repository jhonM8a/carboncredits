package org.jochoa.actions;

import org.jochoa.constants.Constant;
import org.jochoa.views.ImagePanel;

import java.awt.event.ActionEvent;

public class ActionsEllipse  extends Action{
    public ActionsEllipse(ImagePanel imagePanel) {
        super(imagePanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.getImagePanel().setNameShape(Constant.ELLIPSE);
        super.showMessageRequestInput(Constant.MESSAGE_ELLIPSE);
    }
}
