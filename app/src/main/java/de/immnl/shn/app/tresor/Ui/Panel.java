package de.immnl.shn.app.tresor.Ui;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel{
    public Panel(int x, int y){
        GridLayout l = new GridLayout(x,y);
        l.setHgap(10);
        l.setVgap(10);
        setLayout(l);
        setBackground(new Color(10,14,20));
        
    }
}
