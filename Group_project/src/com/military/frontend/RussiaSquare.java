package com.military.frontend;
import com.military.backend.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.*;
import java.awt.*;

public class RussiaSquare extends Panel_1{
    public ImageIcon image = new ImageIcon("Images/russiaEmblem.png");
    private String heading = "Russia";
    private String infoFilePath = "Information_center/russia.txt";
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



    public RussiaSquare(){
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
                RussiaPopup russiaPopUp = new RussiaPopup();
            }
        });
        return btn;
    }

}
    