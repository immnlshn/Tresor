package de.immnl.shn.app.tresor.Ui;

import de.immnl.shn.app.tresor.Tresor;
import java.awt.event.*;

public class Numpadbutton extends Button{
    public Numpadbutton(String text){
        super(text);
        addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e){ 
              try{Tresor.input(e.getActionCommand().charAt(0));}
              catch(InterruptedException err){}
            }
        });
    }
}
