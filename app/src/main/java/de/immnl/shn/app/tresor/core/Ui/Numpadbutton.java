package de.immnl.shn.app.tresor.core.Ui;

import javax.swing.JButton;
import java.awt.event.*;

public class Numpadbutton extends JButton{
    public Numpadbutton(String text){
        setText(text);
        addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
              System.out.println("Deine Mum");
            } 
        });
    }
}
