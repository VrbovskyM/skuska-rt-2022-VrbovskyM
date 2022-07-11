package sk.stuba.fei.uim.oop.components;

import lombok.Data;
import sk.stuba.fei.uim.oop.listeners.MyKeyListener;
import sk.stuba.fei.uim.oop.objects.Line;
import sk.stuba.fei.uim.oop.objects.Turtle;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
@Data
public class PaintPanel extends JPanel {

    private final ArrayList<Turtle> turtles;
    private Turtle curTurtle;
    private final ArrayList<Line> lines;
    public PaintPanel(Config config, MyLabel sizeAndDegree) {
        setFocusable(true);
        turtles = new ArrayList<>();
        lines = new ArrayList<>();
        curTurtle = new Turtle(300, 250);
        MyKeyListener myKeyListener = new MyKeyListener(this, config, lines, curTurtle, sizeAndDegree);
        this.addKeyListener(myKeyListener);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Line line : lines) {
            line.drawLine(g);
        }
        curTurtle.drawTurtle(g);
    }
}
