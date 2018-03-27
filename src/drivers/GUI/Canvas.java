package drivers.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Canvas extends JPanel {
    Canvas() {
        super();
        init();
    }

    private void init() {
        this.setLayout(new GridBagLayout());
        this.setSize(600, 400);

        BufferedImage image = new BufferedImage(600, 400, BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics = image.createGraphics();

        Random rand = new Random();
        graphics.setColor(new Color(rand.nextInt(0xFFFFFF)));

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setBackground(Color.white);
        //graphics.fill(new RegularPolygon(x, y, radius, sides));
    }
}
