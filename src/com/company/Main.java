package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main extends JPanel {

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        //ArrayList<Point> points = DataPoint.ArrayFromFile("C:\\Users\\norma\\IdeaProjects\\K-Means\\src\\com\\company\\Point.txt");

        ArrayList<Point> points = DataPoint.ArrayFromRandom(4000);
        ArrayList<Point> centroids = DataPoint.ArrayFromRandom(10);

        for (int i = 0; i < 500; i++) {
            for (Point point : points) {
                KMeansMapper.map(centroids, point);
            }
            centroids = KMeansReducer.reduce(centroids, points);
        }
        affichage(g2d, points, centroids);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(750, 750);
        frame.add(new Main());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static Color color() {
        Random ra = new Random();
        int r = ThreadLocalRandom.current().nextInt(0, 255 + 1);
        int g = ThreadLocalRandom.current().nextInt(0, 255 + 1);
        int b = ThreadLocalRandom.current().nextInt(0, 255 + 1);
        return new Color(r, g, b);
    }

    public static void affichage(Graphics2D g2d, ArrayList<Point> points, ArrayList<Point> centroids) {
        ArrayList<Color> colorPoint = new ArrayList<Color>();
        for (Point centroid : centroids) {
            colorPoint.add(color());
        }

        for (Point point : points) {
            g2d.setColor(colorPoint.get(centroids.indexOf(point.get_centroid())));
            Ellipse2D.Double circle = new Ellipse2D.Double(point.get_x() * 10, point.get_y() * 10, 10, 10);
            g2d.fill(circle);
        }

        for (Point centroid : centroids) {
            g2d.setColor(Color.BLACK);
            Ellipse2D.Double circle = new Ellipse2D.Double(centroid.get_x() * 10, centroid.get_y() * 10, 15, 15);
            g2d.fill(circle);
        }
    }
}
