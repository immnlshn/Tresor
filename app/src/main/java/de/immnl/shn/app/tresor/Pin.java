package de.immnl.shn.app.tresor;

import javax.swing.JOptionPane;

public class Pin {
    private char[] code = new char[10];
    private int checkpos=0;

    public Pin(String pin){
        System.out.println("set chr");
        for(int i=0; i<10; i++){
            try{code[i]=pin.charAt(i);System.out.println("set chr");}
            catch(IndexOutOfBoundsException err){
                JOptionPane.showMessageDialog(null, "Invalid Pin\n\nMUST be 10 characters");
            }
        }
        System.out.println(this.code);
    }
    public boolean check(char chr){
        if(code[checkpos]==chr){
            checkpos++;
            return true;
        }
        return false;
    }    
}
