package com.military.frontend.Strategy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class Strategy extends JPanel implements ActionListener{
   private int iconSize = 50;
   private JPanel Component = new JPanel();
   private ImageIcon backGroundImage = new ImageIcon("Images/Strategy/map.png");


   private static ImageIcon resizer(ImageIcon img, int width, int heigth){

      Image temp = img.getImage();
      Image temp_2 = temp.getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH);
      ImageIcon newImage = new ImageIcon(temp_2);
      return newImage;
}

   public void actionPerformed(ActionEvent actionEvent) {
      JLabel airCraft = new JLabel(resizer(new ImageIcon("Images/Strategy/aircraft.png"), this.iconSize, this.iconSize));
      JLabel warship = new JLabel(resizer(new ImageIcon("Images/Strategy/warship.png"), this.iconSize, this.iconSize));
      JLabel groundForce = new JLabel(resizer(new ImageIcon("Images/Strategy/groundForces.png"), this.iconSize, this.iconSize));
   
      if(actionEvent.getActionCommand().equals("Add Air Forces")){
         this.add(new militaryUnit(airCraft), 1, 0);
         }
         else if(actionEvent.getActionCommand().equals("Add Naval Forces")){
         this.add(new militaryUnit(warship), 1, 0);
         }
         else if(actionEvent.getActionCommand().equals("Add Ground Forces")){
         this.add(new militaryUnit(groundForce), 1, 0);
         }

      this.revalidate();
      validate();
   }
   public Strategy() {
      ImageIcon bgImage = resizer(this.backGroundImage, 1450, 550);
      JLabel pic = new JLabel(bgImage);
      this.add(pic, -1, 0);
      JButton addAircraft = new addButton("Add Air Forces", resizer(new ImageIcon("Images/Strategy/aircraft.png"), 40, 40), 70, 70);
      JButton addWarship = new addButton("Add Naval Forces", resizer(new ImageIcon("Images/Strategy/warship.png"), 40, 40), 70, 70);
      JButton addGround = new addButton("Add Ground Forces", resizer(new ImageIcon("Images/Strategy/groundForces.png"), 40, 30), 70, 70);
      this.add(addAircraft, BorderLayout.SOUTH);
      this.add(addWarship, BorderLayout.SOUTH);
      this.add(addGround, BorderLayout.SOUTH);
      addAircraft.addActionListener(this);
      addWarship.addActionListener(this);
      addGround.addActionListener(this);
   }
}