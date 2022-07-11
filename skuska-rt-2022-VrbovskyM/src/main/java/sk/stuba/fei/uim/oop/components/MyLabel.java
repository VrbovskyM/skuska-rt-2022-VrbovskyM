package sk.stuba.fei.uim.oop.components;

import javax.swing.*;

public class MyLabel extends JLabel {

    public MyLabel(String label, Config config) {
        super(label);
        setOpaque(true);
        setFocusable(false);
    }
}
