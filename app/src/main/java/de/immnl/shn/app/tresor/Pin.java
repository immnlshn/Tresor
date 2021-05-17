package de.immnl.shn.app.tresor;

import javax.swing.JOptionPane;

public class Pin {
    private char[] code = new char[10];
    private int checkpos=0;
    private int attempts = 3;

    public Pin(String pin){
        for(int i=0; i<=9; i++){
            try{code[i]=pin.charAt(i);}
            catch(IndexOutOfBoundsException err){JOptionPane.showMessageDialog(null, "Invalid Pin\n\nMUST be 10 characters!");}
        }
    }
    public boolean check(char chr){
        if(code[checkpos]==chr){checkpos++;if(checkpos == 10){Tresor.unlock();checkpos=0;attempts=3;}return true;}
        else{if(attempts == 0){JOptionPane.showMessageDialog(null, "You don't have any password attempts left!");System.exit(0);}attempts--; Tresor.setAttempts(attempts); return false;}        
    }
    public int getAttempts(){
        return attempts;
    }
}
