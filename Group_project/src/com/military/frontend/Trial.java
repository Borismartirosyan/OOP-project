package com.military.frontend;

import com.military.backend.USFirst;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class Trial extends JFrame {
    public Trial(){
        JLabel lbl = new JLabel();
        ImageIcon image = new ImageIcon("/Users/borismartirosyan/Desktop/AUA/OOP/Group_project/Images/Screen Shot 2022-05-02 at 21.04.34.png");
        lbl.setIcon(image);
        this.add(lbl);
        this.setVisible(true);
    }
}
