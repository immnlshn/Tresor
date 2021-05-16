package de.immnl.shn.app.tresor;


// import javax.swing.JOptionPane;

import de.immnl.shn.app.tresor.Ui.Gui;

public class Tresor {
    // public static final Pin code = new Pin((String)JOptionPane.showInputDialog(null, "Input a Pin\n\n\nIt MUST be 10 characters."));
    public static final Pin code = new Pin("0987654321");
    static Gui a = new Gui();

    public static void main(String[] args) {
        a.setVisible(true);
    }
    public static void input(char chr) throws InterruptedException{
        if(code.check(chr)){a.getLockWindow().correct();a.getLockWindow().updateDisplay(a.getLockWindow().text+String.valueOf(chr));}
        else{a.getLockWindow().incorrect();}
    }

    public static void unlock(){
        a.setOptionWindow();
    }
}
 