package valdes.com.company;

import javax.swing.*;


public class MainWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawingCanvas drawingCanvas = new DrawingCanvas(800, 600);
        frame.setSize(900, 700);
        frame.setTitle("Aquarium");
        frame.add(drawingCanvas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
