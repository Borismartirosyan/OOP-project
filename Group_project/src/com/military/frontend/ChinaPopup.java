package com.military.frontend;
import javax.swing.*;
import java.awt.*;

public class ChinaPopup extends PopUp{
    protected  String heading = "China";
    protected ImageIcon image = new ImageIcon("PicturesInPopup/china.jpeg");
    protected String textPath = "Information_center/chinapopup.txt";
    protected final String color = "#999999";

    @Override
    protected String getHeading(){ return this.heading;}
    @Override
    protected ImageIcon getImg() { return this.image;}
    @Override
    protected String getTextPath() {return this.textPath;}
    @Override
    protected String getColor(){return this.color;}

    public ChinaPopup(){
        this.setSize(getWidth(), getHeight());
        this.add(this.makePanelWithImage(), BorderLayout.PAGE_START);
        this.add(this.largeTextPanel());
        this.setBackground(Color.decode(this.getColor()));
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}