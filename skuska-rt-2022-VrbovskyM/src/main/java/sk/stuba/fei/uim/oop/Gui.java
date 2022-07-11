package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.components.BotMenu;
import sk.stuba.fei.uim.oop.components.Config;
import sk.stuba.fei.uim.oop.components.MyLabel;
import sk.stuba.fei.uim.oop.components.PaintPanel;

import javax.swing.*;
import java.awt.*;
public class Gui {

    public Gui() {
        JFrame f = new JFrame();

        f.setFocusable(false);
        f.setMinimumSize(new Dimension(700,700));
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        Config config = new Config();
        MyLabel sizeAndDegree = new MyLabel("Degree 45 Size 10", config);
        PaintPanel panel = new PaintPanel(config, sizeAndDegree);
        f.add("Center", panel);
        f.add("South", new BotMenu(config, panel, sizeAndDegree));

        f.setVisible(true);

    }

}
