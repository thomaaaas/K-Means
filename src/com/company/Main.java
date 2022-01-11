package com.company;

public class Main {

    public static void main(String[] args) {
        Point p = new Point(1.0,2.0);
        Point p2 = new Point(10.0,12.0);
        System.out.println(p.distance(p2));
        ReadFile.Read("C:\\Users\\norma\\IdeaProjects\\K-Means\\src\\com\\company\\Point.txt");
    }
}
