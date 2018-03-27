package drivers.GUI;

import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {

    ControlPanel() {
        super();
        init();
    }

    private void init() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        this.setSize(new Dimension(600,100));
        JButton load = new JButton("Add to collection");
        c.gridx = 0;
        c.gridwidth = 1;
        c.gridy = 0;
        this.add(load, c);

        JButton save = new JButton("Add to collection");
        c.gridx = 0;
        c.gridwidth = 1;
        c.gridy = 1;
        this.add(save, c);

        JButton reset = new JButton("Add to collection");
        c.gridx = 0;
        c.gridwidth = 1;
        c.gridy = 2;
        this.add(reset, c);
    }
}
