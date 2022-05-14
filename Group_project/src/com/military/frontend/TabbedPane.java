package com.military.frontend;
import javax.swing.*;
import com.military.frontend.Strategy.*;

public class TabbedPane extends JTabbedPane{
    public TabbedPane(){
        this.setBounds(0, 0, getWidth(), getHeight());
        this.add("Encyclopedia",new Encyclopedia());
        this.add("Ranking Page", new Ranking());
        this.add("Strategy part", new Strategy());
        this.add("AI helper", new AI());
    }
}
