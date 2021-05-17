package de.immnl.shn.app.tresor.Ui;

import java.awt.*;
import javax.swing.*;


public class changePasswordWindow extends Panel{
    JTextField password = new JTextField();
    JTextArea info = new JTextArea("Your pin MUST be numeric\nand MUST have a length of 10 characters.\nEnter your pin below:");


    public changePasswordWindow(){
        setLayout(new GridLayout(3,1));
        setOpaque(true);
        build();
    
    }

    public void build(){
        info.setFont(new Font(Font.MONOSPACED, Font.PLAIN,  32));
        info.setBackground(new Color(10,14,20));
        info.setForeground(new Color(255,255,255));
        info.setLineWrap(true);
        info.setHighlighter(null);
        info.setEditable(false);
        add(info);
        password.setBackground(new Color(14, 19, 28));
        password.setForeground(new Color(255,255,255));
        password.setFont(new Font(Font.MONOSPACED, Font.PLAIN,  32));
        password.setHorizontalAlignment(JTextField.CENTER);
        password.setBorder(null);
        add(password);
        add(new Changepasswordbutton());
    }
}


