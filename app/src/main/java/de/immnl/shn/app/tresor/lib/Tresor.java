package de.immnl.shn.app.tresor.lib;


// import javax.swing.JOptionPane;

import de.immnl.shn.app.tresor.Ui.Gui;

public class Tresor {
    public static Pin code;
    static Gui a = new Gui();

    public static void start(){
        a.setVisible(true);
        if(code == null){
            changePassword();
        }
        a.changePassword();
    }
    public static void input(char chr) throws InterruptedException{
        if(code.check(chr)){a.getLockWindow().correct();a.getLockWindow().updateDisplay(a.getLockWindow().text+String.valueOf(chr));}
        else{a.getLockWindow().incorrect();}
    }

    public static void unlock(){
        a.unlock();
    }
    public static void lock(){
        a.lock();
    }

    public static void changePassword(){
        a.changePassword();
    }

    public static void setPassword(){
        code = new Pin(a.getPassword());
        lock();
    }

    public static int getAttempts(){
        return code.getAttempts();
    }
    public static void setAttempts(int attmpts){
        a.getLockWindow().setAttempts(attmpts);
    }
}
 