package valdes.com.company;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;

public class Plant {
    private double x;
    final private double y = 475;
    private final double size;
    final private Color color = Color.green;

    public Plant(double x, double size) {
        this.x = x;
        this.size = size;
    }

    public void drawPlant(Graphics2D g2d) {
        Path2D.Double path = new Path2D.Double();
        g2d.setColor(color);
        path.moveTo(x, y);
        path.lineTo(x + 20, y);
        path.lineTo(x + 40, y - 50);
        path.lineTo(x - 15, y - 50);
        path.lineTo(x, y);
        g2d.fill(path);

        g2d.setColor(Color.black);

        Line2D.Double l1 = new Line2D.Double();
        l1.setLine(x + 5, y, x - 2, y - 50);
        g2d.draw(l1);

        Line2D.Double l2 = new Line2D.Double();
        l2.setLine(x + 8, y, x + 8, y - 50);
        g2d.draw(l2);

        Line2D.Double l3 = new Line2D.Double();
        l3.setLine(x + 12, y, x + 20, y - 50);
        g2d.draw(l3);
    }
}
