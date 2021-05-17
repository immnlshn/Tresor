package de.immnl.shn.app.tresor.Ui;

import java.awt.GridLayout;
import javax.swing.*;


public class changePasswordWindow extends Panel{

    public changePasswordWindow(){
        GridLayout l = new GridLayout(2,1);
        l.setVgap(25);
        setLayout(l);
        build();
    
    }

    public void build(){
        add(new JTextField());
    }
}


