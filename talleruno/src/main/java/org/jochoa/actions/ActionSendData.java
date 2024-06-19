package org.jochoa.actions;

import org.jochoa.controllers.imp.SaveController;
import org.jochoa.views.FormSaveDataPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionSendData implements ActionListener {

    JComboBox<String> lands;
    JComboBox<String> evaluators;
    JComboBox<String> states;

    SaveController saveController;

    public ActionSendData(JComboBox<String> lands, JComboBox<String> evaluators,
                          JComboBox<String> states, SaveController saveController){

    this.lands = lands;
    this.evaluators = evaluators;
    this.states = states;
    this.saveController = saveController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String land = (String) lands.getSelectedItem();
        String evaluator = (String) evaluators.getSelectedItem();
        String state = (String) states.getSelectedItem();

        land = land.split("-")[0];
        evaluator = evaluator.split("-")[0];
        state = state.split("-")[0];

        Long landId = Long.parseLong(land);
        Long evaluatorId = Long.parseLong(evaluator);



        saveController.sendData(landId, evaluatorId, state);



    }
}
