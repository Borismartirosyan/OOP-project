package com.military.frontend;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.FileInputStream;
import java.util.Scanner;

public abstract class Panel_1 extends JPanel {
    protected ImageIcon image;
    protected String heading;
    protected String infoFilePath;
    protected String color = "#999999";
    protected JLabel lbl;
    protected JTextArea smallText;
    protected JButton btn = new JButton("Read more");

    public abstract ImageIcon getImage();

    public abstract String getHeading();

    public abstract String getInfoFilePath();

    public abstract String getColor();

    public abstract JLabel getLbl();

    public abstract JTextArea getSmallText();

    protected ImageIcon resizeImage(){
        Image temp = getImage().getImage();
        Image temp_2 = temp.getScaledInstance(310, 200, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newImage = new ImageIcon(temp_2);
        return newImage;
    }

    protected String textSearcher(){
        Scanner s = null;
        String text = "";
        try{
            s = new Scanner(new FileInputStream(getInfoFilePath()));
            while (s.hasNext()){
                text = text + s.nextLine() + "\n";
            }
        }
        catch (Exception e){
            return e.getMessage();
        }
        return text;
    }

    protected JLabel imageAndHeading(){
        JLabel temp = getLbl();
        temp.setIcon(resizeImage());
        temp.setText(getHeading());
        temp.setHorizontalTextPosition(JLabel.CENTER);
        temp.setVerticalTextPosition(JLabel.TOP);
        return getLbl();
    }

    protected JTextArea smallText(){
        JTextArea temp = new JTextArea(textSearcher(), 2, 12);
        temp.setBackground(Color.decode(getColor()));
        temp.setEditable(false);
        return temp;
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
                USpopup usPopUp = new USpopup();
            }
        });
        return btn;
    }
}
