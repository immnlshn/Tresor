package de.immnl.shn.app.tresor.Ui;
import javax.swing.*;

import de.immnl.shn.app.tresor.Tresor;

import java.awt.*;

public class Gui extends JFrame{
    Panel Numpad = new Panel(4,4);
    public String text = "Pin: ";
    JLabel pin = new JLabel(text);
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
        synchronized(pin){
            pin.setBackground(new Color(0,255,0));
            pin.wait(10);
            pin.setBackground(new Color(255,255,255));
        }

    }
    public void incorrect() throws InterruptedException{
        synchronized(pin){
            pin.setBackground(new Color(255,0,0));
            pin.wait(10);
            pin.setBackground(new Color(255,255,255));
        }
    }
}