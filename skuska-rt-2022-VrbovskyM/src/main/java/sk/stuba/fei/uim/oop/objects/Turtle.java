package sk.stuba.fei.uim.oop.objects;

import lombok.Data;

import java.awt.*;
@Data
public class Turtle {
    private int x, y, prevX, prevY;
    private int x1, y1, x2, y2;
    private int bodySize, headSize;
    private int headAngle;
    private int centerHeadX, centerHeadY;
    private int centerBodyX, centerBodyY;
    public Turtle(int x, int y) {
        this.x = 300;
        this.y = 250;
        this.prevX = x;
        this.prevY = y;
        bodySize = 100;
        headSize = 50;
    }
    public void drawTurtle(Graphics g) {
        setCoords();
        g.setColor(Color.green);
        g.fillOval(x1, y1, bodySize, bodySize);
        g.setColor(Color.BLACK);
        g.fillOval(x2, y2, headSize, headSize);
    }
    public void setCoords() {
        x1 = x;
        y1 = y;
        x2 = x1 + (bodySize / 2) - (headSize / 2);
        y2 = y1 - (headSize / 2);
    }

    public void changeHead(int degree) {
        centerHeadX = x2 + (headSize / 2);
        centerHeadY = y2 + (headSize / 2);
        centerBodyX = x1 + (bodySize / 2);
        centerBodyY = y1 + (bodySize / 2);
        int r1 = Math.abs(centerHeadX - centerBodyX);
        r1 = (int) Math.pow(r1,2);

        int r2 = Math.abs(centerBodyY - centerHeadY);
        r2 = (int) Math.pow(r2, 2);

        int r = (int) Math.sqrt(r1 + r2);

    }
}
