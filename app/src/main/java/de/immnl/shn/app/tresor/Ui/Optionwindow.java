package de.immnl.shn.app.tresor.Ui;


import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Optionwindow extends Panel{
    public Optionwindow(){
        GridLayout l = new GridLayout(2,1);
        l.setVgap(25);
        setLayout(l);
        build();
    }

    public void build(){
        // add(new Lockbutton(), BorderLayout.LINE_START);
        // add(new Changepwdbutton(), BorderLayout.LINE_END);
        add(new Lockbutton());
        add(new Changepwdbutton());
    }
}
