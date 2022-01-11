package com.company;

import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class ReadFile {

    public static ArrayList<Point> ArrayFromFile(String fileName) {
        ArrayList<Point> pointArray = new ArrayList();
        try {
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                pointArray.add(new Point(x, y));
            }
            return pointArray;
        } catch (Exception e) {
            System.out.println(e.toString());
            return pointArray;
        }
    }
}
