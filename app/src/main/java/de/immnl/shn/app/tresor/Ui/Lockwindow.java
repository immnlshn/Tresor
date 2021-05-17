package de.immnl.shn.app.tresor.Ui;

import javax.swing.*;

import de.immnl.shn.app.tresor.Tresor;

import java.awt.*;
import java.awt.event.*;

public class Lockwindow extends JPanel{
    GridLayout numlayout = new GridLayout(4,4);
    Panel Numpad = new Panel();
    Panel Display = new Panel();
    public String text = "Pin: ";
    JLabel pin = new JLabel(text);
    JLabel attempts = new JLabel("Attempts left: 3");
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
        Display.setLayout(new GridLayout(2,1));
        pin.setOpaque(true);
        pin.setFont(new Font(Font.MONOSPACED, Font.BOLD,  32));
        pin.setBackground(new Color(10,14,20));
        pin.setForeground(new Color(255,255,255));
        attempts.setOpaque(true);
        attempts.setFont(new Font(Font.MONOSPACED, Font.BOLD,  32));
        attempts.setBackground(new Color(10,14,20));
        attempts.setForeground(new Color(255,255,255));
        Display.add(pin);
        Display.add(attempts);
        add(Numpad, BorderLayout.CENTER);
        add(Display, BorderLayout.NORTH);

    }
    public void updateDisplay(String inptext){text = inptext;pin.setText(text);}
    public void resetDisplay(){text = "Pin: "; pin.setText(text);}
    public void resetAttempts(){attempts.setText("Attempts left: 3");}
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

    public void setAttempts(int attmpts){
        attempts.setText("Attempts left: "+attmpts);
    }
}
