package org.jochoa;

import org.jochoa.controllers.MainController;
import org.jochoa.models.*;
import org.jochoa.views.MainWindow;

public class Main {
    public static void main(String[] args) {

       /* System.out.println("Hello world!");
        Line line1 = new Line(new Point(19,27), new Point(50,27));
        System.out.println("" +line1.perimeter());

        Circle circle = new Circle(new Point(19,23), 22);
        Square square = new Square(new Point(28,64), 23);
        Rectangle rectangle = new Rectangle(new Point(122, 65), 34,56);

        MainWindow mainWindow = new MainWindow();
        mainWindow.setVisible(true);*/

        MainController mainController = new MainController();
        mainController.dibujar();
    }
}