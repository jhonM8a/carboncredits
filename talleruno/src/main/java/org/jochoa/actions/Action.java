package org.jochoa.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Action implements ActionListener {
    @Override
    public abstract void actionPerformed(ActionEvent e);

}
