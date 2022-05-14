package com.military.frontend;


import javax.swing.*;
import java.awt.*;

public class JapanPopup extends PopUp{
    protected  String heading = "Japan";
    protected ImageIcon image = new ImageIcon("PicturesInPopup/japan.png");
    protected String textPath = "Information_center/japanpopup.txt";
    protected final String color = "#999999";

    @Override
    protected String getHeading(){ return this.heading;}
    @Override
    protected ImageIcon getImg() { return this.image;}
    @Override
    protected String getTextPath() {return this.textPath;}
    @Override
    protected String getColor(){return this.color;}

    public JapanPopup(){
        this.setSize(getWidth(), getHeight());
        this.add(this.makePanelWithImage(), BorderLayout.PAGE_START);
        this.add(this.largeTextPanel());
        this.setBackground(Color.decode(this.getColor()));
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}