package com.military.frontend;


import javax.swing.*;
import java.awt.*;

public class IndiaPopup extends PopUp{
    protected  String heading = "India";
    protected ImageIcon image = new ImageIcon("PicturesInPopup/india.png");
    protected String textPath = "Information_center/indiapopup.txt";
    protected final String color = "#999999";

    @Override
    protected String getHeading(){ return this.heading;}
    @Override
    protected ImageIcon getImg() { return this.image;}
    @Override
    protected String getTextPath() {return this.textPath;}
    @Override
    protected String getColor(){return this.color;}

    public IndiaPopup(){
        this.setSize(getWidth(), getHeight());
        this.add(this.makePanelWithImage(), BorderLayout.PAGE_START);
        this.add(this.largeTextPanel());
        this.setBackground(Color.decode(this.getColor()));
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}