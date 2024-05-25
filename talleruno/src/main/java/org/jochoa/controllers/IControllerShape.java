package org.jochoa.controllers;

import org.jochoa.models.Point;
import org.jochoa.models.Shape;
import org.jochoa.views.ImagePanel;

import java.awt.event.MouseEvent;

public interface IControllerShape {
    public void draw(Shape shape, Point pointStart, MouseEvent e, ImagePanel imagePanel);
}
