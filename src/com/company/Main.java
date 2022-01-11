package com.company;

import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Dimension;

public class Main extends JPanel {

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        //ArrayList<Point> points = ReadFile.ArrayFromFile("C:\\Users\\norma\\IdeaProjects\\K-Means\\src\\com\\company\\Point.txt");
        ArrayList<Point> points = ReadFile.ArrayFromRandom(100);
        ArrayList<Point> centroids = new ArrayList();
        centroids.add(new Point(12.0,10.0));
        centroids.add(new Point(25.0,36.0));
        centroids.add(new Point(52.0,56.0));

        for(Point centroid : centroids){
            g2d.setColor(Color.magenta);
            Ellipse2D.Double circle = new Ellipse2D.Double(centroid.get_x()*10, centroid.get_y()*10, 10, 10);
            g2d.fill(circle);
        }

        for(int i = 0; i < 50; i++){
            for (Point point : points) {
                KMeansMapper.map(centroids, point);
            }
            for (Point point : points) {
                if(point.get_centroid() == centroids.get(0)){
                    g2d.setColor(Color.black);
                }else if(point.get_centroid() == centroids.get(1)){
                    g2d.setColor(Color.green);
                }else{
                    g2d.setColor(Color.orange);
                }
                Ellipse2D.Double circle = new Ellipse2D.Double(point.get_x()*10, point.get_y()*10, 10, 10);
                g2d.fill(circle);
                System.out.println(point);
            }
            centroids = KMeansReducer.reduce(centroids, points);
            System.out.println("-------------------");
        }

        for(Point centroid : centroids){
            g2d.setColor(Color.red);
            Ellipse2D.Double circle = new Ellipse2D.Double(centroid.get_x()*10, centroid.get_y()*10, 10, 10);
            g2d.fill(circle);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new Main());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
