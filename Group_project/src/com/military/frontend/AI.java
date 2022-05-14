/**
 * A class for our program's AI section. Contains instance variables for AI panel, which are mainly Swing objects.
 * Contains mutators of those instance variables, which make those objects more suitable for the panel
 * @author Boris Martirosyann <a href="mailto:boris.martirosyan@picsart.com">boris.martirosyan@picsart.com</a>
 * @version 1.0
 * @since 1.0
 */

package com.military.frontend;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class AI extends Panel{
    private final String modelProgram = "/Users/borismartirosyan/Desktop/tensorflow-test/main.py";
    private final String backgroundColor = "#999999";
    private JTextArea input = new JTextArea();
    private JTextPane pageDescription = new JTextPane();
    private JButton sender = new JButton();
    private JButton selector = new JButton();
    private JTextArea answerPart = new JTextArea();


    /**
     * getter for python program
     * @return String pogram location
     */
    public String getModelProgram(){
        return this.modelProgram;
    }

    /**
     * getter for background color
     * @return
     */
    public String getBackgroundColor(){
        return this.backgroundColor;
    }

    /**
     * mutator for sender button. Can open JFileChooser, where we can select a .jpg file that will be sent to AI.
     * Has python program path and runs it as gets the file path, if it is a correct file path.
     * @return the sender button with a bunch of magic
     */
    public JButton senderButtonDevelopent(){
        this.sender.setBounds(630, 200, 200, 30);
        this.sender.setBackground(Color.RED);
        this.sender.setText("Choose file and send to AI");
        this.sender.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pythonFile = getModelProgram();
                String imgPath = "";
                String pythonPath = "/Users/borismartirosyan/Desktop/tensorflow-test/env/bin/python";
                JFileChooser fchooser = new JFileChooser();
                int response = fchooser.showOpenDialog(null);



                if (response == JFileChooser.APPROVE_OPTION && fchooser.getSelectedFile().getAbsolutePath().endsWith(".png")) {
                    imgPath = fchooser.getSelectedFile().getAbsolutePath();

                    try {
                        File tempChecker = new File(imgPath);
                        if (!tempChecker.exists()) {
                            answerPartDevelopment().setText("Come on boss, this path doesn't exist");
                            return;
                        }
                        Process p = Runtime.getRuntime().exec(new String[]{pythonPath, pythonFile, imgPath});
                        p.waitFor();
                        Scanner sc = new Scanner(new InputStreamReader(p.getInputStream()));

                        ArrayList<String> lines = new ArrayList<String>();
                        while (sc.hasNextLine()) {
                            String line = sc.nextLine();
                            if (line.length() == 0) continue;
                            lines.add(line);
                        }
                        answerPartDevelopment().setText(lines.get(1));
                    } catch (Exception i) {
                        System.out.println(i.getMessage());
                    }
                }
                else{
                    answerPartDevelopment().setText("I accept files with only '.png' extension");
                }
            }
        });
        return this.sender;
    }

    /**
     * JPane mutator for the page description
     * @return JPane description
     */
    public JTextPane pageDescriptionDevelopement(){
            String description ="This part of the program will help drones to differentiate objects. Now our AI,\n" +
                                 "based on Deep Convolutional Neural Networks can differentiate between aircraft and\n"+
                                 "tanks images. You can check it's performance by typing the path of your image \n"+
                                 "in the input part (below white area). A little reminder, please don't put there monkey's\n"+
                                 "image path. Thank you!";
        this.pageDescription.setText(description);
        this.pageDescription.setBounds(450, 50, 580, 50);
        this.pageDescription.setBackground(Color.decode(this.getBackgroundColor()));
        this.pageDescription.setEditable(false);
        return this.pageDescription;
    }

    /**
     * JTextArea mutator for getting answer
     * @return
     */
    public JTextArea answerPartDevelopment(){
        this.answerPart.setBounds(550, 250, 350, 30);
        this.answerPart.setEditable(false);
        return this.answerPart;
    }

    /**
     * Constructor for the AI JPanel
     */
    public AI(){
        this.add(answerPartDevelopment());
        this.add(senderButtonDevelopent());
        this.add(pageDescriptionDevelopement());
        this.setLayout(null);
        this.setBackground(Color.decode(this.backgroundColor));
    }


}

