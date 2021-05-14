package de.immnl.shn.app.tresor.core.Ui;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel{
    public GridBagConstraints c = new GridBagConstraints();
    public Panel(){
        setLayout(new GridBagLayout());
        c.insets = new Insets(5,5,5,5);
    }
}
