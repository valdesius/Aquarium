package valdes.com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    Sun sun = new Sun(500,500,500,50,50,Color.yellow);
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawOval(234, 456, 56, 45);
        g2d.setColor(Color.WHITE);
        g2d.fillRect(23, 44, 500, 500);
        sun.draw(g2d);
        sun.setN(40);

    }
    }
