package sk.stuba.fei.uim.oop.objects;

import lombok.Data;

import java.awt.*;
@Data
public class Line {
    private int x, y, startX, startY;
    private int x1, y1, x2, y2;
    private Color c;
    public Line(int x1, int y1, int x2, int y2, Color c) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.startX = x;
        this.startY = y;
        this.c = c;
    }

    public void drawLine(Graphics g) {
        g.setColor(c);
        g.drawLine(x1, y1, x2, y2);
    }
}
