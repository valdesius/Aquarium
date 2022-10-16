package valdes.com.company;

import java.awt.*;
import java.awt.geom.Path2D;

public class Table {

    public void drawTable(Graphics2D g2d) {
        g2d.setColor(Color.DARK_GRAY);
        int m = 100;
        int n = 4;
        int x[][] = new int[m][n];
        int y[][] = new int[m][n];
        int xPoints[] = new int[n];
        int yPoints[] = new int[n];

        x[0][0] = 160;
        x[0][1] = 850;
        x[0][2] = 800;
        x[0][3] = 100;
        y[0][0] = 450;
        y[0][1] = 450;
        y[0][2] = 550;
        y[0][3] = 550;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                xPoints[j] = x[i][j];
                yPoints[j] = y[i][j];
            }
            Polygon p = new Polygon(xPoints, yPoints, n);
            g2d.fillPolygon(p);
        }
        Path2D.Double p1 = new Path2D.Double();
        g2d.setColor(new Color(0x000000));
        p1.moveTo(250, 550);
        p1.lineTo(250, 675);
        p1.lineTo(275, 675);
        p1.lineTo(275, 550);
        g2d.fill(p1);

        Path2D.Double p2 = new Path2D.Double();
        g2d.setColor(new Color(0x000000));
        p1.moveTo(620, 550);
        p1.lineTo(620, 675);
        p1.lineTo(645, 675);
        p1.lineTo(645, 550);
        g2d.fill(p1);

        Path2D.Double p3 = new Path2D.Double();
        g2d.setColor(new Color(0x000000));
        p1.moveTo(695, 550);
        p1.lineTo(695, 635);
        p1.lineTo(720, 635);
        p1.lineTo(720, 550);
        g2d.fill(p1);

        Path2D.Double p4 = new Path2D.Double();
        g2d.setColor(new Color(0x000000));
        p1.moveTo(320, 550);
        p1.lineTo(320, 635);
        p1.lineTo(345, 635);
        p1.lineTo(345, 550);
        g2d.fill(p1);


    }
}
