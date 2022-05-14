package com.military.frontend;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.util.Scanner;

public abstract class PopUp extends JFrame {
    protected  String heading;
    protected final int height = 600;
    protected final int width = 600;
    protected final String color = "#999999";

    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }

    protected abstract String getHeading();
    protected abstract ImageIcon getImg() ;
    protected abstract String getTextPath();
    protected abstract String getColor();

    protected JLabel headingLabel(){
        JLabel heading = new JLabel();
        heading.setText(getHeading());
        return heading;
    }


    protected ImageIcon imageMaker(){
        Image temp = getImg().getImage();
        Image temp_2 = temp.getScaledInstance(310, 200, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newImage = new ImageIcon(temp_2);
        return newImage;
    }

    protected String textSearcher(){
        Scanner s = null;
        String text = "";
        try{
            s = new Scanner(new FileInputStream(getTextPath()));
            while (s.hasNext()){
                text = text + s.nextLine() + "\n";
            }
        }
        catch (Exception e){
            return e.getMessage();
        }
        return text;
    }

    protected JLabel headingWithImage(){
        JLabel imageLabel = new JLabel();
        imageLabel.setText(getHeading());
        imageLabel.setIcon(imageMaker());
        imageLabel.setText(getHeading());
        imageLabel.setHorizontalTextPosition(JLabel.CENTER);
        imageLabel.setVerticalTextPosition(JLabel.TOP);
        return imageLabel;
    }

    protected JTextArea setText(){
        JTextArea temp = new JTextArea(textSearcher());
        temp.setBackground(Color.decode(getColor()));
        temp.setText(textSearcher());
        temp.setEditable(false);
        temp.setPreferredSize(new Dimension(550, 250));
        return temp;
    }

    protected JPanel makePanelWithImage(){
        JPanel mainPanel = new JPanel();
        mainPanel.setBounds(0, 0, 200, 250);
        mainPanel.add(headingWithImage());
        return mainPanel;
    }

    protected JPanel largeTextPanel(){
        JPanel textPanel = new JPanel();
        textPanel.setBounds(0, 230, 200, 250);
        textPanel.add(setText());
        return textPanel;
    }
}
