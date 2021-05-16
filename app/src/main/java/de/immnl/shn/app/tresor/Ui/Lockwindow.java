package de.immnl.shn.app.tresor.Ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lockwindow extends JPanel{
    GridLayout numlayout = new GridLayout(4,4);
    Panel Numpad = new Panel();
    public String text = "Pin: ";
    JLabel pin = new JLabel(text);
    Boolean isGreen = false;
    Boolean isRed = false;
    int delay = 500;

    public Lockwindow() {
        setLayout(new BorderLayout());
        build();
    }
    private void build(){ 
        numlayout.setHgap(15);
        numlayout.setVgap(15);
        Numpad.setLayout(numlayout);
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
        pin.setOpaque(true);
        pin.setFont(new Font(Font.MONOSPACED, Font.BOLD,  32));
        pin.setBackground(new Color(10,14,20));
        pin.setForeground(new Color(255,255,255));
    }
    public void updateDisplay(String inptext){text = inptext;pin.setText(text);}
    public void correct() throws InterruptedException{
        Timer t = new Timer(delay, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(isGreen) {pin.setBackground(new Color(10,14,20));isGreen = false; ((Timer)e.getSource()).stop();}
            }
        });
        pin.setBackground(new Color(0,255,0));
        isGreen = true;
        t.start();
    }
    public void incorrect() throws InterruptedException{
        Timer t = new Timer(delay, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(isRed) {pin.setBackground(new Color(10,14,20));isRed = false; ((Timer)e.getSource()).stop();}
            }
        });
        pin.setBackground(new Color(255,0,0));
        isRed = true;
        t.start();
    }
}
