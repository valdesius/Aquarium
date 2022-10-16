package valdes.com.company;

import java.awt.*;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.RoundRectangle2D;

public class Feed {

    public void drawFeed(Graphics2D g2d) {
        RoundRectangle2D.Double r = new RoundRectangle2D.Double();
        g2d.setColor(new Color(0x333));
        r.x = 760;
        r.y = 420;
        r.height = 80;
        r.width = 50;
        r.archeight = 10;
        r.arcwidth = 10;
        g2d.fill(r);

        g2d.setColor(new Color(0xABABAB));

        g2d.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 10));

        g2d.drawString("Корм", 770, 440);

        Path2D.Double p1 = new Path2D.Double();
        p1.moveTo(808, 497);
        p1.lineTo(820, 470);
        p1.lineTo(820, 410);
        p1.lineTo(808, 421);
        p1.moveTo(820, 410);
        p1.lineTo(770, 410);
        p1.lineTo(762, 420);

        g2d.fill(p1);

        Path2D.Double p2 = new Path2D.Double();
        p2.moveTo(820, 410);
        p2.lineTo(762, 420);
        p2.lineTo(820, 420);
        g2d.fill(p2);

        g2d.setColor(new Color(0x333));

        Ellipse2D.Double el1 = new Ellipse2D.Double(774, 410, 23, 8);
        g2d.fill(el1);


    }
}
