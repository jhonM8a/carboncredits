package org.jochoa.views;

import org.jochoa.actions.ActionSquare;
import org.jochoa.constants.Constant;
import org.jochoa.controllers.SquareControl;
import org.jochoa.models.Point;
import org.jochoa.models.Square;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ImagePanel extends JPanel {
    private BufferedImage image;
    Point pointStartClick;

    Square square;

    private String nameShape;

    List<Square> squareList = new ArrayList<>();

    private int count = 0;
    public ImagePanel(){

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("figure: "+nameShape);
                pointStartClick = new Point();
                pointStartClick.setX(e.getX());
                pointStartClick.setY(e.getY());
                //System.out.println("x:"+pointStartClick.getX() + "- y:"+pointStartClick.getY());
                String inputValue  = JOptionPane.showInputDialog(e.getComponent(), Constant.MESSAGE_SIDE_SQUARE);
                if(nameShape !=null && nameShape.equals("square")){
                    count =count +1;
                    JOptionPane.showMessageDialog(e.getComponent(), "Input value: " +inputValue);
                    square = new Square(pointStartClick,Integer.parseInt(inputValue));
                    System.out.println(count);
                    if(count == 1){
                        square.setColor(Color.BLUE);
                        squareList.add(square);
                        e.getComponent().repaint();
                    } else if (count  ==2) {
                        square.setColor(Color.RED);
                        squareList.add(square);
                        e.getComponent().repaint();
                    }
                    count = count >2? 0:count;


                    /*SquareControl squareControl = new SquareControl(square,e);
                    squareControl.addCountSquare();
                    count = squareControl.getSquaresCount();
                    squareControl.draw();
                    System.out.println(count);*/
                }

                /*if (inputValue != null) {
                    square = new Square(pointStartClick,Integer.parseInt(inputValue));
                    e.getComponent().repaint();

                } else {
                    JOptionPane.showMessageDialog(e.getComponent(), "Empty input value bitch");
                }*/
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
        if(squareList !=null && count<=2){
            for (Square square : squareList) {
                g.setColor(square.getColor());
                System.out.println(square.getStart().getX() + "-"+ square.getStart().getY());
                g.drawRect(square.getStart().getX(), square.getStart().getY(), square.getSide(), square.getSide());
            }
            if(count == 2){
                count = 0;
            }
        }else{
            count = 0;
        }

        /*if(square !=null && count==2){
            g.setColor(Color.RED);
            g.drawRect(square.getStart().getX(),square.getStart().getY(), square.getSide(), square.getSide());
            count = 0;
        }*/
    }

    public void setBackgroundImage(BufferedImage image) {
        this.image = image;
        repaint();
    }

    public Point getPointStartClick() {
        return pointStartClick;
    }

    public void setNameShape(String nameShape) {
        this.nameShape = nameShape;
    }
}
