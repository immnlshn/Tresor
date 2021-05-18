package de.immnl.shn.app.tresor.Ui;

import java.awt.event.*;

import de.immnl.shn.app.tresor.lib.Tresor;

public class Changetopasswordwindowbutton extends Button{
    public Changetopasswordwindowbutton(){
        super("Change Password");
        addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e){ 
              Tresor.changePassword();
            }
        });
    }
}
