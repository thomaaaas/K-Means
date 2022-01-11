package com.company;

import java.util.Scanner;
import java.io.File;

public class ReadFile {

    public static void Read(String fileName){
        try{
            File file=new File(fileName);
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                System.out.println(x + " " + y);
                Point p = new Point(x,y);
                System.out.println(p.toString());
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
