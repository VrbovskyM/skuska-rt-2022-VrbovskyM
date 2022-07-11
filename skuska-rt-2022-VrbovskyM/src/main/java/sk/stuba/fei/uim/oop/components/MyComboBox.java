package sk.stuba.fei.uim.oop.components;

import sk.stuba.fei.uim.oop.listeners.MyItemListener;

import javax.swing.*;

public class MyComboBox extends JComboBox<String> {

    public MyComboBox(MyItemListener itemListener) {
        super(new String[] {"0", "5", "45", "90", "180"});
        setFocusable(false);
        addItemListener(itemListener);

    }
}
