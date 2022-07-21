package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(2.343,2.3432222));
    }
    public static boolean areEqualByThreeDecimalPlaces(double x, double y){
        double x1000 = x * 1000;
        double y1000 = y * 1000;
        if((int)x1000 == (int)y1000){
            return true;
        }
        else{
            return false;
        }
    }
}
