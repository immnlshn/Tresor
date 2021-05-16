package de.immnl.shn.app.tresor.Ui;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame{
    Panel Numpad = new Panel(4,4);
    public String text = "Pin: ";
    JLabel pin = new JLabel(text);
    Boolean isGreen = false;
    Boolean isRed = false;
    int delay = 500;
    public Gui(){
        setSize(520,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pin.setOpaque(true);
        build();
    }
    private void build(){ 
        Numpad.add(new Numpadbutton("7"));
        Numpad.add(new Numpadbutton("8"));
        Numpad.add(new Numpadbutton("9"));
        Numpad.add(new Numpadbutton("4"));
        Numpad.add(new Numpadbutton("5"));
        Numpad.add(new Numpadbutton("6"));
        Numpad.add(new Numpadbutton("1"));
        Numpad.add(new Numpadbutton("2"));
        Numpad.add(new Numpadbutton("3"));
        Numpad.add(new JLabel());
        Numpad.add(new Numpadbutton("0"));
        add(Numpad, BorderLayout.CENTER);
        add(pin, BorderLayout.NORTH);
    }
    public void updateDisplay(String inptext){
        text = inptext;
        pin.setText(text);
    }
    public void correct() throws InterruptedException{
        Timer t = new Timer(delay, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(isGreen) {pin.setBackground(new Color(255,255,255));isGreen = false; ((Timer)e.getSource()).stop();}
            } 
        });
        pin.setBackground(new Color(0,255,0));
        isGreen = true;
        t.start();

    }
    public void incorrect() throws InterruptedException{
        Timer t = new Timer(delay, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(isRed) {pin.setBackground(new Color(255,255,255));isRed = false; ((Timer)e.getSource()).stop();}
            } 
        });
        pin.setBackground(new Color(255,0,0));
        isRed = true;
        t.start();
    }
}