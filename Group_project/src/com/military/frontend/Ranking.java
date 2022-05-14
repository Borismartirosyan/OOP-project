package com.military.frontend;

import javax.swing.*;

public class Ranking extends Panel{
    private final String headingOfPage = "Strongest countries";

    public Ranking(){

        this.add(new USSquare());
        this.add(new RussiaSquare());
        this.add(new IndiaSquare());
        this.add(new ChinaSquare());
        this.add(new TurkeySquare());
        this.add(new FranceSquare());
        this.add(new JapanSqaure());
        this.add(new SkoreaSquare());
    }
}
