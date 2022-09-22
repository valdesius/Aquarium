package valdes.com.company;

import java.awt.*;
import java.awt.geom.*;

public final class Aquarium {
    public Aquarium() {
    }

    public void drawAquarium(Graphics2D g2d) {
        Path2D.Double p1 = new Path2D.Double();
        g2d.setColor(new Color(0x0492c2));
        p1.moveTo(200, 200);
        p1.lineTo(700, 200);
        p1.lineTo(700, 500);
        p1.lineTo(200, 500);
        p1.lineTo(200, 200);

        p1.lineTo(250, 150);
        p1.lineTo(750, 150);
        p1.lineTo(700, 200);
        p1.moveTo(750, 150);
        p1.lineTo(750, 450);
        p1.lineTo(700, 500);
        Path2D.Double p2 = new Path2D.Double();
        p2.moveTo(700,200);
        p2.lineTo(700,500);
        p2.lineTo(750,150);
        g2d.fill(p1);
        g2d.setColor(new Color(0x0492c2));
        g2d.fill(p2);

        Path2D.Double bottom = new Path2D.Double();
        g2d.setColor(new Color(0x076280));
        bottom.moveTo(200, 500);
        bottom.lineTo(250, 450);
        bottom.lineTo(750, 450);
        bottom.lineTo(700, 500);
        g2d.fill(bottom);

        Path2D.Double border = new Path2D.Double();
        g2d.setColor(new Color(0x3D3D3D));
        border.moveTo(200, 500);
        border.lineTo(200,200);
        border.lineTo(250,150);
        border.lineTo(750,150);
        border.lineTo(700,200);
        border.lineTo(200,200);
        border.moveTo(700,200);
        border.lineTo(700,500);
        border.lineTo(750,450);
        border.lineTo(750,150);
        border.moveTo(750,450);
        border.lineTo(250, 450);//up
        border.lineTo(200, 500);
        border.lineTo(700, 500);
        border.moveTo(250, 450);
        border.lineTo(250,150);
        g2d.draw(border);
        //wave line
        g2d.setColor(Color.BLACK);
        QuadCurve2D.Double curve1 = new QuadCurve2D.Double(200,250,220,220,250,250);
        QuadCurve2D.Double curve2 = new QuadCurve2D.Double(250,250,270,220,300,250);
        QuadCurve2D.Double curve3 = new QuadCurve2D.Double(300,250,320,220,350,250);
        QuadCurve2D.Double curve4 = new QuadCurve2D.Double(350,250,370,220,400,250);
        QuadCurve2D.Double curve5 = new QuadCurve2D.Double(400,250,420,220,450,250);
        QuadCurve2D.Double curve6 = new QuadCurve2D.Double(450,250,470,220,500,250);
        QuadCurve2D.Double curve7 = new QuadCurve2D.Double(500,250,520,220,550,250);
        QuadCurve2D.Double curve8 = new QuadCurve2D.Double(550,250,570,220,600,250);
        QuadCurve2D.Double curve9 = new QuadCurve2D.Double(600,250,620,220,650,250);
        QuadCurve2D.Double curve10 = new QuadCurve2D.Double(650,250,670,220,700,250);
        QuadCurve2D.Double curve11 = new QuadCurve2D.Double(700,250,710,200,725,230);
        QuadCurve2D.Double curve12 = new QuadCurve2D.Double(725,230,725,200,740,210);
        QuadCurve2D.Double curve13 = new QuadCurve2D.Double(740,210,740,185,750,200);
        g2d.draw(curve1);
        g2d.draw(curve2);
        g2d.draw(curve3);
        g2d.draw(curve4);
        g2d.draw(curve5);
        g2d.draw(curve6);
        g2d.draw(curve7);
        g2d.draw(curve8);
        g2d.draw(curve9);
        g2d.draw(curve10);
        g2d.draw(curve11);
        g2d.draw(curve12);
        g2d.draw(curve13);
    }
}
