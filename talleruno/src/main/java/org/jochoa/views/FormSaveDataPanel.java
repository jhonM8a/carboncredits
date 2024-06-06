package org.jochoa.views;

import org.jochoa.models.Land;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class FormSaveDataPanel extends JPanel {
    public FormSaveDataPanel(DefaultComboBoxModel<String> landsCombo, DefaultComboBoxModel<String> evaluatorCombo){
        setLayout(null); // Establecer el layout como null

        JComboBox<String> comboBoxLands = new JComboBox<>(landsCombo);
        JComboBox<String> comboBoxEvaluators = new JComboBox<>(landsCombo);
        JComboBox<String> comboBoxState = new JComboBox<>(landsCombo);


        JButton sendData = new JButton("Send");

        comboBoxLands.setBounds(50, 50, 300, 30); // Establecer la posición y el tamaño del comboBox
        comboBoxEvaluators.setBounds(50, 100, 300, 30); // Establecer la posición y el tamaño del campo de texto
        comboBoxState.setBounds(50, 150, 300, 30); // Establecer la posición y el tamaño del campo de texto
        sendData.setBounds(150, 200, 100, 30); // Establecer la posición y el tamaño del botón

        add(comboBoxLands);
        add(comboBoxEvaluators);
        add(comboBoxState);
        add(sendData);


    }

}
