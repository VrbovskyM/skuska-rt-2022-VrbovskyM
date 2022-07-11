package sk.stuba.fei.uim.oop.components;

import lombok.Data;

import java.awt.*;
import java.util.ArrayList;
@Data
public class Config {

    private ArrayList<Color> colors;
    private ArrayList<Integer> allDegrees;
    private int colorCounter;
    private int curDegree;
    private int curStepSize;
    public Config() {
        colors = new ArrayList<>();
        createColors();
        colorCounter = 0;
        curDegree = 45;
        curStepSize = 10;
        allDegrees = new ArrayList<>();
        addDegrees();
    }
    private void addDegrees() {
        allDegrees.add(0);
        allDegrees.add(5);
        allDegrees.add(10);
        allDegrees.add(45);
        allDegrees.add(90);
        allDegrees.add(180);

    }
    private void createColors() {
        colors.add(Color.RED);
        colors.add(Color.ORANGE);
        colors.add(Color.CYAN);
    }
    public Color getCurrentColor() {
        return colors.get(colorCounter%3);
    }
}
