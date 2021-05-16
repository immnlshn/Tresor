package de.immnl.shn.app.tresor.Ui;
import javax.swing.*;

import java.awt.*;

public class Gui extends JFrame{
    CardLayout card = new CardLayout();
    Lockwindow lock = new Lockwindow();
    Optionwindow option = new Optionwindow();
    public Gui(){
        setSize(520,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(card);
        add(lock);
        add(option);
    }

    public Lockwindow getLockWindow(){
        return lock;
    }
    public Optionwindow getOptionWindow(){
        return option;
    }

    public void next(){
        card.next(getContentPane());
    }
}