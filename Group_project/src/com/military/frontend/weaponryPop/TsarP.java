package com.military.frontend.weaponryPop;

import com.military.frontend.PopUp;

import javax.swing.*;
import java.awt.*;

public class TsarP extends PopUp {
    protected  String heading = "Tsar Bomba";
    protected ImageIcon image = new ImageIcon("Images/tsarP.png");
    protected String textPath = "Information_center/nukep.txt";
    protected final String color = "#999999";

    @Override
    protected String getHeading(){ return this.heading;}
    @Override
    protected ImageIcon getImg() { return this.image;}
    @Override
    protected String getTextPath() {return this.textPath;}
    @Override
    protected String getColor(){return this.color;}

    public TsarP(){
        this.setSize(getWidth(), getHeight());
        this.add(this.makePanelWithImage(), BorderLayout.PAGE_START);
        this.add(this.largeTextPanel());
        this.setBackground(Color.decode(this.getColor()));
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}
