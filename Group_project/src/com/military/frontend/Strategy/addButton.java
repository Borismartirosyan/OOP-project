package com.military.frontend.Strategy;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class addButton extends JButton {
    addButton(String text, ImageIcon img, int x, int y){
        this.setText(text);
        this.setPreferredSize(new Dimension(200, 50));
        setIcon(img);
        setSize(x, y);
    }
    
}
// package com.military.frontend.Strategy;
// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;

// public class addButton extends JButton implements ActionListener{
//     private int type;
//     addButton(String text, ImageIcon img, int x, int y, int type){
//         this.type = type;
//         this.setText(text);
//         setSize(x, y);
//         setIcon(img);
//         setLocation(x, y);
//         this.addActionListener(this);
//     }

//     public void addUnit(int type){
//         switch (type) {
//            case ForceTypes.aircraftUnit:
//                this.add(new militaryUnit(new JLabel(Strategy.resizer(new ImageIcon(ForceTypes.aircraftUnitIcon), 100, 50)), 200, 300));
//                this.revalidate();
//                validate();
//                this.repaint();
//                break;
  
//            case ForceTypes.navyUnit:
//               this.add(new militaryUnit(new JLabel(Strategy.resizer(new ImageIcon(ForceTypes.navyUnitIcon), 100, 50)), 200, 300));
//               this.revalidate();
//               validate();
//               this.repaint();
  
//            break;
  
//            case ForceTypes.groundUnit:
//               this.add(new militaryUnit(new JLabel(Strategy.resizer(new ImageIcon(ForceTypes.groundUnitIcon), 100, 50)), 200, 300));
//               this.revalidate();
//               validate();
//               this.repaint();
  
//                break;
  
//            default:
//                break;
//        }
//      }
    
//     public void actionPerformed(ActionEvent evt) {
//         // System.out.println(evt);
//         // JLabel label = new JLabel(Strategy.resizer(new ImageIcon("Images/Strategy/aircraft.png"), 100, 50));
//         // militaryUnit airUnit = new militaryUnit(label, 50, 50);
//         // JLabel label2 = new JLabel(Strategy.resizer(new ImageIcon("Images/Strategy/aircraft.png"), 100, 50));
//         // militaryUnit navyUnit = new militaryUnit(label2, 50, 50);
//         addUnit(type);
//         this.revalidate();
//         validate();
//     }
// }
