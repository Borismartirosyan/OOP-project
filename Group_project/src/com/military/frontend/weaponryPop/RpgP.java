package com.military.frontend.weaponryPop;

import com.military.frontend.PopUp;

import javax.swing.*;
import java.awt.*;

public class RpgP extends PopUp {
    protected  String heading = "RPG";
    protected ImageIcon image = new ImageIcon("Images/rpgp.jpg");
    protected String textPath = "Information_center/rpgp.txt";
    protected final String color = "#999999";

    @Override
    protected String getHeading(){ return this.heading;}
    @Override
    protected ImageIcon getImg() { return this.image;}
    @Override
    protected String getTextPath() {return this.textPath;}
    @Override
    protected String getColor(){return this.color;}

    public RpgP(){
        this.setSize(getWidth(), getHeight());
        this.add(this.makePanelWithImage(), BorderLayout.PAGE_START);
        this.add(this.largeTextPanel());
        this.setBackground(Color.decode(this.getColor()));
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}
