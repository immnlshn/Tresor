package de.immnl.shn.app.tresor;

import javax.swing.JOptionPane;

public class Pin {
    private char[] code = new char[10];
    private int checkpos=0;

    public Pin(String pin){
        for(int i=0; i<=9; i++){
            try{code[i]=pin.charAt(i);}
            catch(IndexOutOfBoundsException err){JOptionPane.showMessageDialog(null, "Invalid Pin\n\nMUST be 10 characters!");}
        }
    }
    public boolean check(char chr){
        if(code[checkpos]==chr){checkpos++;if(checkpos == 10){Tresor.unlock();checkpos=0;}return true;}
        return false;
    }    
}
