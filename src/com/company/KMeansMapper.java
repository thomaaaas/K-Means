package com.company;

import java.util.ArrayList;

public class KMeansMapper{

    public static void map(ArrayList<Point> centroids, Point point){
        double minDistance = Double.MAX_VALUE;
        for (int i = 0; i < centroids.size(); i++) {
            double distance = point.distance(centroids.get(i));
            if(distance < minDistance) {
                point.set_centroid(centroids.get(i));
                minDistance = distance;
            }
        }
    }
}
