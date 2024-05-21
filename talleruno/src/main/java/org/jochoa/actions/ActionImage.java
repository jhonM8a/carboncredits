package org.jochoa.actions;

import org.jochoa.views.ImagePanel;
import org.jochoa.views.MainPanel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ActionImage extends Action{


    ImagePanel imagePanel;
    public ActionImage(ImagePanel imagePanel){
        this.imagePanel = imagePanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Llegue perros");
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                BufferedImage images = ImageIO.read(selectedFile);
                imagePanel.setBackgroundImage(images);

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

