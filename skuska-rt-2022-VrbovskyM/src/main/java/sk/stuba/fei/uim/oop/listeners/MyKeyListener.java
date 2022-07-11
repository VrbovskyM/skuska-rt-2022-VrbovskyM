package sk.stuba.fei.uim.oop.listeners;

import sk.stuba.fei.uim.oop.components.Config;
import sk.stuba.fei.uim.oop.components.MyLabel;
import sk.stuba.fei.uim.oop.components.PaintPanel;
import sk.stuba.fei.uim.oop.objects.Line;
import sk.stuba.fei.uim.oop.objects.Turtle;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class MyKeyListener implements KeyListener {
    private ArrayList<Line> lines;
    private final PaintPanel panel;
    private final Config config;
    private final Turtle turtle;
    private int stepSize, curDegree;
    private final MyLabel sizeAndDegree;
    public MyKeyListener(PaintPanel panel, Config config, ArrayList<Line> lines, Turtle turtle, MyLabel sizeAndDegree) {
        this.panel = panel;
        this.config = config;
        this.lines = lines;
        this.turtle = turtle;
        this.sizeAndDegree = sizeAndDegree;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        stepSize = config.getCurStepSize();
        curDegree = config.getCurDegree();
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            turtle.changeHead(curDegree);
            turtle.setPrevY(turtle.getY());
            turtle.setY(turtle.getY() - stepSize);
            drawLine();

        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            turtle.changeHead(curDegree);
            turtle.setPrevY(turtle.getY());
            turtle.setY(turtle.getY() + stepSize);
            drawLine();
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            int curDegreeIndex = config.getAllDegrees().indexOf(config.getCurDegree());
            if (curDegreeIndex == 0) return;
            else {
                config.setCurDegree(config.getAllDegrees().get(curDegreeIndex - 1));
                sizeAndDegree.setText("Degree " + config.getCurDegree() + "Size " + config.getCurStepSize());
                turtle.changeHead(config.getCurDegree());
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            int curDegreeIndex = config.getAllDegrees().indexOf(config.getCurDegree());
            if (curDegreeIndex == 5) return;
            else {
                config.setCurDegree(config.getAllDegrees().get(curDegreeIndex + 1));
                sizeAndDegree.setText("Degree " + config.getCurDegree() + "Size " + config.getCurStepSize());
                turtle.changeHead(config.getCurDegree());
            }

        }
        panel.repaint();
    }
    public void drawLine() {
        int x1 = turtle.getPrevX() + turtle.getBodySize()/2;
        int y1 = turtle.getPrevY();
        int x2 = turtle.getX() + turtle.getBodySize()/2;
        int y2 = turtle.getY();
        lines.add(new Line(x1, y1, x2, y2, config.getCurrentColor()));
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
