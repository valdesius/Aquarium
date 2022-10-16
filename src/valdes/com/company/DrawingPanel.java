package valdes.com.company;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;


public class DrawingPanel extends Component {
    Background background = new Background();
    Animation animation1;
    Animation animation2;
    Aquarium aquarium = new Aquarium();
    Plant plant1 = new Plant(350, 6);
    Plant plant2 = new Plant(375, 6);
    Plant plant3 = new Plant(400, 6);
    Plant plant4 = new Plant(425, 6);
    Plant plant5 = new Plant(575, 6);
    Plant plant6 = new Plant(600, 6);

    Table table = new Table();
    Feed feed = new Feed();

    public int frame = 0;
    public double startTime = now();
    public double lastTime = now();

    public Timer timer = new Timer();

    DrawingPanel(Animation animation) {
        this.animation1 = animation;
        this.animation2 = animation;

        timer.scheduleAtFixedRate(
                new TimerTask() {
                    public void run() {
                        repaint();
                    }
                }
                , 10, 1000 / 30);
    }

    public void paint(Graphics g) {
        double nowTime = now();
        Graphics2D g2d = (Graphics2D) g;

        frame += 1;


        g.clearRect(0, 0, getWidth(), getHeight());
        background.drawBackground(g2d);
        table.drawTable(g2d);
        aquarium.drawAquarium(g2d);
        plant1.drawPlant(g2d);
        plant2.drawPlant(g2d);
        plant3.drawPlant(g2d);
        plant4.drawPlant(g2d);
        plant5.drawPlant(g2d);
        plant6.drawPlant(g2d);
        animation1.drawAnimationSineWave(g, getSize(), nowTime - startTime, nowTime - lastTime, frame);
        animation2.drawAnimationUpDown(g, getSize(), nowTime - startTime, nowTime - lastTime, frame);
        feed.drawFeed(g2d);
//        g2d.drawString("Аквариум", 450, 50);

        lastTime = nowTime;
    }

    public Dimension getPreferredSize() {
        return new Dimension(900, 700);
    }

    public static double now() {
        long t = System.currentTimeMillis();

        return (double) t / 1000.0f;
    }
}
