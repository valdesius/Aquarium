package valdes.com.company;

import java.awt.*;
import java.awt.geom.Path2D;

public class Background {
    public void drawBackground(Graphics2D graphics2D) {
        Path2D.Double p1 = new Path2D.Double();
        graphics2D.setColor(new Color(0x00A81F));
        p1.moveTo(0, 0);
        p1.lineTo(70, 0);
        p1.lineTo(70, 700);
        p1.lineTo(0, 700);
        graphics2D.fill(p1);


        Path2D.Double p2 = new Path2D.Double();
        graphics2D.setColor(new Color(0x2DC782));
        p2.moveTo(70, 0);
        p2.lineTo(140, 0);
        p2.lineTo(140, 700);
        p2.lineTo(70, 700);
        graphics2D.fill(p2);

        Path2D.Double p3 = new Path2D.Double();
        graphics2D.setColor(new Color(0x00A81F));
        p3.moveTo(140, 0);
        p3.lineTo(210, 0);
        p3.lineTo(210, 700);
        p3.lineTo(140, 700);
        graphics2D.fill(p3);

        graphics2D.setColor(new Color(0x2DC782));
        Path2D.Double p4 = new Path2D.Double();

        p4.moveTo(210, 0);
        p4.lineTo(280, 0);
        p4.lineTo(280, 700);
        p4.lineTo(210, 700);
        graphics2D.fill(p4);


        Path2D.Double p5 = new Path2D.Double();
        graphics2D.setColor(new Color(0x00A81F));
        p5.moveTo(280, 0);
        p5.lineTo(350, 0);
        p5.lineTo(350, 700);
        p5.lineTo(280, 700);
        graphics2D.fill(p5);

        Path2D.Double p6 = new Path2D.Double();
        graphics2D.setColor(new Color(0x2DC782));
        p6.moveTo(350, 0);
        p6.lineTo(420, 0);
        p6.lineTo(420, 700);
        p6.lineTo(350, 700);
        graphics2D.fill(p6);

        Path2D.Double p7 = new Path2D.Double();
        graphics2D.setColor(new Color(0x00A81F));
        p7.moveTo(420, 0);
        p7.lineTo(490, 0);
        p7.lineTo(490, 700);
        p7.lineTo(420, 700);
        graphics2D.fill(p7);

        Path2D.Double p8 = new Path2D.Double();
        graphics2D.setColor(new Color(0x2DC782));
        p8.moveTo(490, 0);
        p8.lineTo(560, 0);
        p8.lineTo(560, 700);
        p8.lineTo(490, 700);
        graphics2D.fill(p8);

        Path2D.Double p9 = new Path2D.Double();
        graphics2D.setColor(new Color(0x00A81F));
        p9.moveTo(560, 0);
        p9.lineTo(630, 0);
        p9.lineTo(630, 700);
        p9.lineTo(560, 700);
        graphics2D.fill(p9);

        Path2D.Double p10 = new Path2D.Double();
        graphics2D.setColor(new Color(0x2DC782));
        p10.moveTo(630, 0);
        p10.lineTo(700, 0);
        p10.lineTo(700, 700);
        p10.lineTo(630, 700);
        graphics2D.fill(p10);

        Path2D.Double p11 = new Path2D.Double();
        graphics2D.setColor(new Color(0x00A81F));
        p11.moveTo(700, 0);
        p11.lineTo(770, 0);
        p11.lineTo(770, 700);
        p11.lineTo(700, 700);
        graphics2D.fill(p11);


        Path2D.Double p12 = new Path2D.Double();
        graphics2D.setColor(new Color(0x2DC782));
        p12.moveTo(770, 0);
        p12.lineTo(840, 0);
        p12.lineTo(840, 700);
        p12.lineTo(770, 700);
        graphics2D.fill(p12);

        Path2D.Double p13 = new Path2D.Double();
        graphics2D.setColor(new Color(0x00A81F));
        p13.moveTo(840, 0);
        p13.lineTo(910, 0);
        p13.lineTo(910, 700);
        p13.lineTo(840, 700);
        graphics2D.fill(p13);

        graphics2D.setColor(Color.white);
        graphics2D.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 30));
        graphics2D.drawString("Аквариум", 400, 100);


    }

}
