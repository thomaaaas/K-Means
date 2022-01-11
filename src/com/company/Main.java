package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Point> points = ReadFile.ArrayFromFile("C:\\Users\\norma\\IdeaProjects\\K-Means\\src\\com\\company\\Point.txt");
        ArrayList<Point> centroids = new ArrayList();

        centroids.add(new Point(12.0,10.0));
        centroids.add(new Point(25.0,36.0));

        for (int i = 0; i < points.size(); i++) {
            KMeansMapper.map(centroids, points.get(i));
        }

        for (int j = 0; j < points.size(); j++) {
            System.out.println(points.get(j));
        }
    }
}
