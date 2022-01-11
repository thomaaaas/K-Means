package com.company;

import java.util.ArrayList;

public class KMeansReducer {

    public static ArrayList<Point> reduce(ArrayList<ArrayList<Point>> points){
        ArrayList<Point> centroids = new ArrayList();
        for (ArrayList<Point> point : points) {
            double somme_x;
            double somme_y;
            for (Point p : point){
                somme_x = point.get_x();
                somme_y = point.get_y();
            }
            somme_x /= points.size();
            somme_y /= points.size();
            centroids.add(new Point(somme_x, somme_y));
        }
        return centroids;
    }
}
