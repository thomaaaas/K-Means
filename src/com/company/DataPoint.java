package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DataPoint {

    public static ArrayList<Point> ArrayFromRandom(int nb){
        ArrayList<Point> pointArray = new ArrayList();
        for(int i = 0; i < nb; i++){
            double x = ThreadLocalRandom.current().nextDouble(0, 70.0 + 1.0);
            double y = ThreadLocalRandom.current().nextDouble(0, 70.0 + 1.0);
            pointArray.add(new Point(x, y));
        }
        return pointArray;
    }

    public static ArrayList<Point> ArrayFromFile(String fileName) {
        ArrayList<Point> pointArray = new ArrayList();
        File file = new File(fileName);
        try(Scanner sc = new Scanner(file)) {
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
