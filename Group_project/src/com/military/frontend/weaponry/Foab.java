package com.military.frontend.weaponry;

import com.military.frontend.Panel_1;
import com.military.frontend.weaponryPop.FlameP;
import com.military.frontend.weaponryPop.FoabP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class Foab extends Panel_1 {
    public ImageIcon image = new ImageIcon("Images/foab.jpg");
    private String heading = "FOAB";
    private String infoFilePath = "Information_center/foab.txt";
    private String color = "#999999";
    private JLabel lbl = new JLabel();
    private JTextArea smallText = null;
    protected JButton btn = new JButton("Read more");

    public ImageIcon getImage(){
        return image;
    }

    public String getHeading(){
        return heading;
    }

    public String getInfoFilePath(){
        return infoFilePath;
    }

    public String getColor(){
        return color;
    }

    public JLabel getLbl(){
        return lbl;
    }

    public JTextArea getSmallText(){
        return smallText;
    }



    public Foab(){
        this.add(this.imageAndHeading());
        this.add(this.smallText());
        this.setPreferredSize(new Dimension(320, 350));
        this.setBackground(Color.decode(this.color));
        this.add(mutateBtn());
    }
    protected JButton mutateBtn(){
        btn.setPreferredSize(new Dimension(90, 35));
        btn.setBounds(new Rectangle(300, 0, 90, 35));
        btn.addActionListener(new Action() {

            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                FoabP foabP = new FoabP();
            }
        });
        return btn;
    }
}
