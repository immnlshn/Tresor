package de.immnl.shn.app.tresor;


import de.immnl.shn.app.tresor.Ui.Gui;

public class Tresor {
    public static final Pin code = new Pin("1234567890");
    static Gui a = new Gui();

    public static void main(String[] args) {
        a.setVisible(true);
    }
    public static void input(char chr) throws InterruptedException{
        if(code.check(chr)){a.correct();a.updateDisplay(a.text+String.valueOf(chr));System.out.println("Correct " + chr);}
        else{a.incorrect();System.out.println("Incorrect "+chr);}
    }
}
