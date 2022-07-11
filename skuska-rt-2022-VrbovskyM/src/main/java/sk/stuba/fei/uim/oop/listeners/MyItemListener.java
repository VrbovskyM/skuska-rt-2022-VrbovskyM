package sk.stuba.fei.uim.oop.listeners;

import sk.stuba.fei.uim.oop.components.Config;
import sk.stuba.fei.uim.oop.components.MyComboBox;
import sk.stuba.fei.uim.oop.components.MyLabel;
import sk.stuba.fei.uim.oop.components.MySlider;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyItemListener implements ItemListener, ChangeListener {
    private final Config config;
    private final MyLabel sizeAndDegree;
    public MyItemListener(Config config, MyLabel sizeAndDegree) {
        this.config = config;
        this.sizeAndDegree = sizeAndDegree;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        MyComboBox cb = (MyComboBox) e.getSource();
        String selectedItem = (String) cb.getSelectedItem();
        int size = Integer.parseInt(selectedItem);
        config.setCurDegree(size);
        sizeAndDegree.setText("Degree " + selectedItem + "Size " + config.getCurStepSize());

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        MySlider s = (MySlider) e.getSource();
        int size = s.getValue();
        config.setCurStepSize(size);
        sizeAndDegree.setText("Degree " + config.getCurDegree() + "Size " + config.getCurStepSize());
    }
}
