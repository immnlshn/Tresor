package de.immnl.shn.app.tresor.core.Ui;
import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame{
    public Gui(){
        setSize(520,600);
        setLayout(new GridBagLayout());
        getContentPane().setBackground(new Color(10,14,20));
        


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}