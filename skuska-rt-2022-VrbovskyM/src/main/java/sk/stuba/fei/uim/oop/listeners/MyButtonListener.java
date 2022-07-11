package sk.stuba.fei.uim.oop.listeners;

import sk.stuba.fei.uim.oop.components.Config;
import sk.stuba.fei.uim.oop.components.PaintPanel;
import sk.stuba.fei.uim.oop.objects.Turtle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonListener implements ActionListener {

    private final Config config;
    private final JLabel curColor;
    private final PaintPanel panel;
    public MyButtonListener(PaintPanel panel, Config config, JLabel curColor) {
        this.config = config;
        this.curColor = curColor;
        this.panel = panel;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Change Color":
                config.setColorCounter(config.getColorCounter() + 1);
                curColor.setBackground(config.getCurrentColor());
                break;
            case "Action":
                moveForward();
                break;

        }
    }
    private void moveForward() {
        Turtle turtle = panel.getCurTurtle();
        turtle.changeHead(config.getCurDegree());
        int stepSize = config.getCurStepSize();


    }
}
