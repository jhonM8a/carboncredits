package org.jochoa.actions;

import org.jochoa.constants.Constant;
import org.jochoa.controllers.imp.SaveController;
import org.jochoa.views.ImagePanel;

import java.awt.event.ActionEvent;

public class ActionSaveData  extends Action{
    SaveController saveController;
    public ActionSaveData(ImagePanel imagePanel) {
        super(imagePanel);
        this.saveController = new SaveController();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.saveController.setDrawablesDao(super.getImagePanel().getDrawables());
        this.saveController.saveData();
    }
}
