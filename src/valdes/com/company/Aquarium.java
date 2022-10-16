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
        p2.moveTo(700, 200);
        p2.lineTo(700, 500);
        p2.lineTo(750, 150);
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
        border.lineTo(200, 200);
        border.lineTo(250, 150);
        border.lineTo(750, 150);
        border.lineTo(700, 200);
        border.lineTo(200, 200);
        border.moveTo(700, 200);
        border.lineTo(700, 500);
        border.lineTo(750, 450);
        border.lineTo(750, 150);
        border.moveTo(750, 450);
        border.lineTo(250, 450);
        border.lineTo(200, 500);
        border.lineTo(700, 500);
        border.moveTo(250, 450);
        border.lineTo(250, 150);
        g2d.draw(border);
        g2d.setColor(Color.BLACK);

        Path2D.Double border2 = new Path2D.Double();
        border2.moveTo(200, 200);
        border2.lineTo(200, 180);
        border2.lineTo(700, 180);
        border2.lineTo(700, 200);
        border2.moveTo(200, 180);
        border2.lineTo(250, 130);
        border2.lineTo(250, 150);
        border2.moveTo(250, 130);
        border2.lineTo(750, 130);
        border2.lineTo(750, 150);
        border2.moveTo(750, 130);
        border2.lineTo(700, 180);



    }


}
