package de.immnl.shn.app.tresor.Ui;
import javax.swing.*;

import java.awt.*;

public class Gui extends JFrame{
    CardLayout card = new CardLayout();
    Lockwindow lock = new Lockwindow();
    Optionwindow option = new Optionwindow();
    changePasswordWindow password = new changePasswordWindow();
    public Gui(){
        setSize(520,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(card);
        add("LOCK",lock);
        add("OPTION", option);
        add("PASSWORD", password);
    }

    public Lockwindow getLockWindow(){
        return lock;
    }
    public Optionwindow getOptionWindow(){
        return option;
    }

    public String getPassword(){
        return password.password.getText();
    }

    public void lock(){
        card.show(getContentPane(), "LOCK");
        lock.resetDisplay();
    }
    public void unlock(){
        card.show(getContentPane(), "OPTION");
    }
    public void changePassword(){
        card.show(getContentPane(), "PASSWORD");
    }
}