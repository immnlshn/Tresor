package de.immnl.shn.app.tresor.Ui;
import java.awt.event.*;

import de.immnl.shn.app.tresor.lib.Tresor;

public class Changepasswordbutton extends Button{
    public Changepasswordbutton(){
        super("Set Password");
        
        addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e){ 
                Tresor.setPassword();
            }
        });
    }
}
