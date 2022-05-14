package com.military.frontend;

import com.military.frontend.weaponry.*;

import javax.swing.*;

public class Encyclopedia extends Panel{
    private final String headingOfPage = "Strongest countries";

    public Encyclopedia(){

        this.add(new RPG());
        this.add(new Flamethrower());
        this.add(new UAV());
        this.add(new SchwererGustav());
        this.add(new Foab());
        this.add(new Icbm());
        this.add(new mirv());
        this.add(new Tsar());
    }
}
