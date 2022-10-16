package valdes.com.company;

import javax.swing.*;

public class MainWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Animation");

        frame.add(new DrawingPanel(new FishAnimation()));

        frame.pack();

        frame.show();
    }
}
