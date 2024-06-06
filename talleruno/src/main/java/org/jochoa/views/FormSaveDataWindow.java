package org.jochoa.views;

import javax.swing.*;
import java.awt.*;

public class FormSaveDataWindow extends JFrame {

    FormSaveDataPanel formSaveDataPanel;
    public FormSaveDataWindow(FormSaveDataPanel formSaveDataPanel){
        this.formSaveDataPanel = formSaveDataPanel;
        setTitle("Form to save data");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
        add(this.formSaveDataPanel, BorderLayout.CENTER);
    }
}
