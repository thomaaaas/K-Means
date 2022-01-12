package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DataPoint {

    public static ArrayList<Point> ArrayFromRandom(int nb){
        ArrayList<Point> pointArray = new ArrayList();
        Random r = new Random();
        for(int i = 0; i < nb; i++){
            double x = ThreadLocalRandom.current().nextDouble(0, 70 + 1);
            double y = ThreadLocalRandom.current().nextDouble(0, 70 + 1);
            pointArray.add(new Point(x, y));
        }
        return pointArray;
    }

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
