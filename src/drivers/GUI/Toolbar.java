package drivers.GUI;

import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;

public class Toolbar extends JPanel {

    Toolbar() {
        super();
        init();
    }

    private void init() {
        this.setLayout(new GridBagLayout());
        this.setSize(new Dimension(600, 100));
        GridBagConstraints c = new GridBagConstraints();

        JLabel label1 = new JLabel("Number of sides");
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0.25;
        c.gridwidth = 1;
        this.add(label1, c);

        JTextField numberOfSides = new JTextField();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 0.25;
        c.gridwidth = 2;
        this.add(numberOfSides, c);

        JLabel label2 = new JLabel("Number of shapes");
        c.gridx = 3;
        c.gridy = 0;
        c.weightx = 0.25;
        c.gridwidth = 1;
        this.add(label2, c);


        JTextField numberOfShapes = new JTextField();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 4;
        c.gridy = 0;
        c.weightx = 0.25;
        c.gridwidth = 2;
        this.add(numberOfShapes, c);

        JLabel label3 = new JLabel("Number for stroke");
        c.gridx = 6;
        c.gridy = 0;
        c.weightx = 0.25;
        c.gridwidth = 1;
        this.add(label3, c);


        JTextField stroke = new JTextField();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 7;
        c.gridy = 0;
        c.weightx = 0.25;
        c.gridwidth = 2;
        this.add(stroke, c);
    }

}
