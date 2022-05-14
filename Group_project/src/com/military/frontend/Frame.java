package com.military.frontend;
import javax.swing.*;

public class Frame extends JFrame {
    private static final int height = 1600;
    private static final int width = 2560;
    private final String nameOfApplication = "Military AI";

    public Frame(){
        this.setTitle(this.nameOfApplication);
        this.add(new TabbedPane());
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setSize(this.height, this.width);
        this.setVisible(true);
        this.setResizable(false);
    }

    /**
     * getter for height
     * @return int height
     */
    public static int getFrameHeight(){return height;}

    /**
     * getter for width
     * @return int width
     */

    public static int getFrameWidth(){return width;}
}
