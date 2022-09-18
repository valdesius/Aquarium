package valdes.com.company;

import java.awt.*;

public class Sun {
    private int x, y, r, L, n;
    private Color c;

    public Sun(int x, int y, int r, int l, int n, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        L = l;
        this.n = n;
        this.c = c;
    }

    public void draw(Graphics2D g2d){
        g2d.setColor(Color.RED);
        g2d.fillOval(x-r, y-r, 2 * r, 2 * r);
        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double a = i * da;
            double x1 = r * Math.cos(a)+x;
            double y1 = r * Math.sin(a)+y;
            double x2 = (r+L) * Math.cos(a)+x;
            double y2 = (r+L) * Math.sin(a)+y;


            g2d.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
    }}

    public void setN(int nf){
        nf = n;
        nf += 10;
    }}
