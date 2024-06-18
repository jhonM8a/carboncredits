package org.jochoa.views;

import org.jochoa.models.Land;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class FormSaveDataPanel extends JPanel {
    public FormSaveDataPanel(DefaultComboBoxModel<String> landsCombo, DefaultComboBoxModel<String> evaluatorCombo
    ,DefaultComboBoxModel<String> state){
        setLayout(null); // Establecer el layout como null

        JComboBox<String> comboBoxLands = new JComboBox<>(landsCombo);
        JComboBox<String> comboBoxEvaluators = new JComboBox<>(evaluatorCombo);
        JComboBox<String> comboBoxState = new JComboBox<>(state);


        JButton sendData = new JButton("Send");

        comboBoxLands.setBounds(100, 50, 300, 30);
        JLabel labelLands = new JLabel("Lands : ");
        labelLands.setBounds(50, 50, 100, 30);

        comboBoxEvaluators.setBounds(100, 100, 300, 30);
        JLabel labelEvaluators = new JLabel("Evaluators : ");
        labelEvaluators.setBounds(30, 100, 100, 30);

        comboBoxState.setBounds(100, 150, 300, 30);
        JLabel labelStates = new JLabel("States : ");
        labelStates.setBounds(50, 150, 100, 30);


        sendData.setBounds(150, 200, 100, 30);

        add(comboBoxLands);
        add(comboBoxEvaluators);
        add(comboBoxState);
        add(sendData);
        add(labelLands);
        add(labelEvaluators);
        add(labelStates);


    }

}
