package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Point> points = ReadFile.ArrayFromFile("C:\\Users\\norma\\IdeaProjects\\K-Means\\src\\com\\company\\Point.txt");
        ArrayList<Point> centroids = new ArrayList();

        centroids.add(new Point(12.0,10.0));
        centroids.add(new Point(25.0,36.0));

        for (Point point : points) {
            KMeansMapper.map(centroids, point);
        }

        for (Point point : points) {
            System.out.println(point);
        }
    }
}
