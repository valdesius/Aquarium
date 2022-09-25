package valdes.com.company;

import javax.swing.*;
import java.awt.*;

public class DrawingCanvas extends JComponent {
    private int width;
    private int height;
    private Aquarium aquarium;
    private Fish fish;
    private Plant plant1;
    private Plant plant2;
    private Plant plant3;
    private Plant plant4;

    public DrawingCanvas(int width, int height) {
        this.width = width;
        this.height = height;
        aquarium = new Aquarium();
        fish = new Fish(300, 300, 100);
        plant1 = new Plant(350, 6);
        plant2 = new Plant(375, 6);
        plant3 = new Plant(400, 6);
        plant4 = new Plant(425, 6);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        aquarium.drawAquarium(g2d);
        fish.drawFish(g2d);
        plant1.drawPlant(g2d);
        plant2.drawPlant(g2d);
        plant3.drawPlant(g2d);
        plant4.drawPlant(g2d);
    }
}
