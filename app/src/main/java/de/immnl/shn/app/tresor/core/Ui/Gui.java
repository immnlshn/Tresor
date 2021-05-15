package de.immnl.shn.app.tresor.core.Ui;
import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame{
    Panel display = new Panel();
    Panel Numpad = new Panel();
    JLabel textfield = new JLabel("Empty");
    public Gui(){
        setSize(520,600);
        getContentPane().setBackground(new Color(10,14,20));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        build();
        setVisible(true);
    }
    public void build(){
        for(int i=9; i<0; i--){
            Numpadbutton btn = new Numpadbutton(String.valueOf(i));
            Numpad.add(btn);
            System.out.println(i);
        }
        display.add(textfield);
        add(Numpad, BorderLayout.CENTER);
        add(display, BorderLayout.NORTH);
    }
}