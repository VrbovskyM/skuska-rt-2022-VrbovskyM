package sk.stuba.fei.uim.oop.components;

import sk.stuba.fei.uim.oop.listeners.MyButtonListener;

import javax.swing.*;

public class MyButton extends JButton {

    public MyButton(String label, MyButtonListener buttonListener) {
        super(label);
        setFocusable(false);
        addActionListener(buttonListener);

    }
}
