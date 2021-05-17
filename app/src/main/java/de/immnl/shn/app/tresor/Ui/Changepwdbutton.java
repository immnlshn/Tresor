package de.immnl.shn.app.tresor.Ui;


import java.awt.Color;
import java.awt.event.*;

import de.immnl.shn.app.tresor.Tresor;

public class Changepwdbutton extends Button{
    public Changepwdbutton(){
        super("Change Password");
        setBackground(new Color(17,97,187));
        addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e){ 
              Tresor.setPassword();
            }
        });
    }
}
