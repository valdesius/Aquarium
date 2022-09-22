package valdes.com.company;

import java.awt.*;
import java.awt.geom.*;

public class Fish {
    private double x;
    private double y;
    private double size;
    private Color color;

    public Fish(double x, double y, double size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    public void drawFish(Graphics2D g2d) {
        Ellipse2D.Double e1 = new Ellipse2D.Double(x, y, size, size);
        g2d.setColor(Color.YELLOW);
        g2d.fill(e1);
    }
}
