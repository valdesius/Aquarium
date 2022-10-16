package valdes.com.company;

import java.awt.*;
import java.util.Timer;

public class FishAnimation implements Animation {

    public void drawAnimationSineWave(Graphics g, Dimension size, double frameTime, double deltaTime, int frameNumber) {
        Graphics2D g2d = (Graphics2D) g;

        double zero = 350;
        double y = zero + 40 * Math.sin(3 * frameTime);
        double tx = frameTime / 5 - (int) (frameTime / 5);
        double x = tx * 400;

        Fish fish1 = new Fish((int) x + 200, (int) y, 100);
        fish1.drawFishReverse(g2d);
    }

    public void drawAnimationUpDown(Graphics g, Dimension size, double frameTime, double deltaTime, int frameNumber) {
        Graphics2D g2d = (Graphics2D) g;

        double zero = 350;
        double y = zero + 40 * Math.sin(3 * frameTime) - 100;
        double tx = frameTime / 5 - (int) (frameTime / 5);
        double x = tx + 100;

        Fish fish2 = new Fish((int) x + 200, (int) y, 100);
        fish2.drawFish(g2d);
    }


}
