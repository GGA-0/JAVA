package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(area(10));
        System.out.println(area(10, 15));
    }
    public static double area (double radius){
        if (radius < 0){
            return -1;
        }
        else{
            double areaC =Math.PI *(radius*radius);
            return areaC;
        }
    }
    public static double area (double x, double y){
        if (x < 0 || y < 0){
            return -1;
        }
        else{
            double areaR = x * y;
            return areaR;
        }
    }
}
