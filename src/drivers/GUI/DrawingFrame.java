package drivers.GUI;

import javax.swing.*;
import java.awt.*;

public class DrawingFrame extends JFrame {

    private Canvas canvas = new Canvas();
    private ControlPanel controlPanel = new ControlPanel();
    private Toolbar toolbar = new Toolbar();


    public DrawingFrame() {
        super("Drawing Application");
        init();
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.getContentPane().add(BorderLayout.CENTER, canvas);
        this.getContentPane().add(BorderLayout.NORTH, toolbar);
        this.getContentPane().add(BorderLayout.SOUTH, controlPanel);

    }
}
