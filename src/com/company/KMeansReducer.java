package com.company;

import java.util.ArrayList;

public class KMeansReducer {

    public static ArrayList<Point> reduce(ArrayList<Point> centroids, ArrayList<Point> points) {
        ArrayList<Point> newCentroids = new ArrayList();

        for (Point centroid : centroids) {
            double somme_x = 0.0;
            double somme_y = 0.0;
            int nbPoints = 0;
            for (Point point : points) {
                if (centroid.equals(point.get_centroid())) {
                    somme_x += point.get_x();
                    somme_y += point.get_y();
                    nbPoints++;
                }
            }
            somme_x /= nbPoints;
            somme_y /= nbPoints;
            newCentroids.add(new Point(somme_x, somme_y));
        }
        return newCentroids;
    }
}
