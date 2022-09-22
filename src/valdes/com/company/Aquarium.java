package valdes.com.company;

import java.awt.*;
import java.awt.geom.*;

public class Aquarium {
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
        //rect
        p1.lineTo(250, 150);
        p1.lineTo(750, 150);
        p1.lineTo(700, 200);
        p1.moveTo(750, 150);
        p1.lineTo(750, 450);
        p1.lineTo(700, 500);


        g2d.draw(p1);

    }
}
