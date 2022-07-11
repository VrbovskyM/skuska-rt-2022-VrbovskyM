package sk.stuba.fei.uim.oop.components;

import sk.stuba.fei.uim.oop.listeners.MyButtonListener;
import sk.stuba.fei.uim.oop.listeners.MyItemListener;

import javax.swing.*;
import java.awt.*;

public class BotMenu extends JPanel {

    public BotMenu(Config config, PaintPanel panel, MyLabel sizeAndDegree) {
        setLayout(new GridLayout(2,3));

        MyLabel curColorLabel = new MyLabel(" ",config);
        curColorLabel.setBackground(config.getCurrentColor());

        MyButtonListener buttonListener = new MyButtonListener(panel, config, curColorLabel);
        MyItemListener itemListener = new MyItemListener(config, sizeAndDegree);

        MyButton action = new MyButton("Action", buttonListener);

        MyButton changeColor = new MyButton("Change Color", buttonListener);

        MyComboBox changeDegree = new MyComboBox(itemListener);
        MySlider changeSize = new MySlider(itemListener);

        add(action);
        add(sizeAndDegree);
        add(changeColor);
        add(curColorLabel);
        add(changeDegree);
        add(changeSize);
    }
}
