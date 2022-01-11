package com.company;

import java.util.ArrayList;

public class KMeansMapper{

    public static void map(ArrayList<Point> centroids, Point point){
        double minDistance = Double.MAX_VALUE;
        for (Point centroid : centroids) {
            double distance = point.distance(centroid);
            if (distance < minDistance) {
                point.set_centroid(centroid);
                minDistance = distance;
            }
        }
    }
}
