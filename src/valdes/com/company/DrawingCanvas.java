package valdes.com.company;

import javax.swing.*;
import java.awt.*;

public class DrawingCanvas extends JComponent {
    private int width;
    private int height;
    private Aquarium aquarium;
    private Fish fish;

    public DrawingCanvas(int width, int height) {
        this.width = width;
        this.height = height;
        aquarium = new Aquarium();
        fish = new Fish(50, 100, 50, Color.YELLOW);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        aquarium.drawAquarium(g2d);
    }
}
