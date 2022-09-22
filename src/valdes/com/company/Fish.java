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
        Ellipse2D.Double el1 = new Ellipse2D.Double();
        g2d.setColor(new Color(0xF5AF00));
        el1.setFrame(x, y, size, size * 0.5);
        g2d.fill(el1);


//        QuadCurve2D.Double curve1 = new QuadCurve2D.Double(x * 1.3259, y * 1.25, x*2.33, y*1.5, x * 1.3259, y * 2);
//        g2d.setColor(new Color(0x076280));
//        g2d.draw(curve1);

//        Ellipse2D.Double el2 = new Ellipse2D.Double();
//        g2d.setColor(new Color(0xFFFFFF));
//        el2.setFrame(35, 55, 12, 12);
//        g2d.fill(el2);
//
//        Line2D.Double line2D = new Line2D.Double();
//        g2d.setColor(new Color(0x000000));
//        line2D.x1 = 40;
//        line2D.x2 = 40;
//        line2D.y1 = 60;
//        line2D.y2 = 63;
//        g2d.draw(line2D);

    }

}
