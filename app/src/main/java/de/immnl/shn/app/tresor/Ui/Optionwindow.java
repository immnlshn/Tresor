package de.immnl.shn.app.tresor.Ui;


import java.awt.BorderLayout;

public class Optionwindow extends Panel{
    public Optionwindow(){
        super(new BorderLayout());
        build();
    }

    public void build(){
        add(new Lockbutton(),BorderLayout.WEST);
        add(new Changepwdbutton(),BorderLayout.EAST);
    }
}
