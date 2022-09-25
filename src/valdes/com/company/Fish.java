package valdes.com.company;

import java.awt.*;
import java.awt.geom.*;

public class Fish {
    private double x;
    private double y;
    private double size;
    final private Color color = new Color(0xF5AF00);

    public Fish(double x, double y, double size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public void drawFish(Graphics2D g2d) {
        Ellipse2D.Double el1 = new Ellipse2D.Double();
        g2d.setColor(color);
        el1.setFrame(x, y, size, size * 0.5);
        g2d.fill(el1);

        Path2D.Double p = new Path2D.Double();
        g2d.setColor(new Color(0x076280));
        p.moveTo(x + 110, y + 50);
        p.lineTo(x + 110, y);
        p.lineTo(x + 80, y + 25);
        p.lineTo(x + 80, y + 25);
        p.lineTo(x + 110, y + 50);
        g2d.fill(p);


        Ellipse2D.Double el2 = new Ellipse2D.Double();
        g2d.setColor(new Color(0xFFFFFF));
        el2.setFrame(x + 15, y + 10, 15, 15);
        g2d.fill(el2);

        Ellipse2D.Double el3 = new Ellipse2D.Double();
        g2d.setColor(Color.BLACK);
        el3.setFrame(x + 20, y + 15, 5, 5);
        g2d.fill(el3);

        QuadCurve2D.Double curve1 = new QuadCurve2D.Double(x + 1, y + 32, x + 17, y + 45, x + 30, y + 35);
        g2d.draw(curve1);
    }

}
