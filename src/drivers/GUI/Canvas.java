package drivers.GUI;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {
    Canvas() {
        super();
        init();
    }

    private void init() {
        this.setLayout(new GridBagLayout());
        this.setSize(600, 400);
    }
}
