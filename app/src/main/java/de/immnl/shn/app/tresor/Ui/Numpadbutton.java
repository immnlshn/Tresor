package de.immnl.shn.app.tresor.Ui;

import javax.swing.JButton;

import de.immnl.shn.app.tresor.Tresor;

import java.awt.event.*;

public class Numpadbutton extends JButton{
    public Numpadbutton(String text){
        setText(text);
        addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e){ 
              try{Tresor.input(e.getActionCommand().charAt(0));}
              catch(InterruptedException err){}
            } 
        });
    }
}
