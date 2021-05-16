package de.immnl.shn.app.tresor.Ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import de.immnl.shn.app.tresor.Tresor;

import java.awt.Color;

public class Lockbutton extends Button{
    public Lockbutton(){
        super("Lock Tresor");
        setBackground(new Color(254, 53, 24));
        addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e){ 
              Tresor.lock();
            }
        });
    }
}
