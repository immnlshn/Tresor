package de.immnl.shn.app.tresor.Ui;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel{
    public Panel(LayoutManager layout){
        setLayout(layout);
        setBackground(new Color(10,14,20));
    }
    public Panel(){
        setLayout(new BorderLayout());
        setBackground(new Color(10,14,20));
    }
}
