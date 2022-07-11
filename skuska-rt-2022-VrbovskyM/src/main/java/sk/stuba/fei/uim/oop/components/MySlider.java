package sk.stuba.fei.uim.oop.components;

import sk.stuba.fei.uim.oop.listeners.MyItemListener;

import javax.swing.*;

public class MySlider extends JSlider {

    public MySlider(MyItemListener itemListener) {
        super(0, 100, 10);
        setFocusable(false);
        setPaintTrack(true);
        setPaintTicks(true);
        setPaintLabels(true);
        setMinorTickSpacing(10);
        setSnapToTicks(true);
        setMajorTickSpacing(100);
        addChangeListener(itemListener);

    }
}
