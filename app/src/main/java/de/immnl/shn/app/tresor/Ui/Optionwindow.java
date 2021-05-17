package de.immnl.shn.app.tresor.Ui;


import java.awt.GridLayout;


public class Optionwindow extends Panel{
    public Optionwindow(){
        GridLayout l = new GridLayout(2,1);
        l.setVgap(25);
        setLayout(l);
        build();
    }

    public void build(){
        add(new Lockbutton());
        add(new Changetopasswordwindowbutton());
    }
}
