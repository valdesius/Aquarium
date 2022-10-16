package valdes.com.company;

import java.awt.*;

public interface Animation {
    public void drawAnimationSineWave(Graphics g, Dimension size, double frameTime, double deltaTime, int frameNumber);

    public void drawAnimationUpDown(Graphics g, Dimension size, double frameTime, double deltaTime, int frameNumber);
}
