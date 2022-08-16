package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(2.75, 3.25,2.5));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        else{
            double area = width * height;
            double bucketsNeeded = area / areaPerBucket - extraBuckets;
            return (int)Math.ceil(bucketsNeeded);
        }
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        else{
            double area = width * height;
            double bucketsNeeded = area / areaPerBucket;
            return (int)Math.ceil(bucketsNeeded);
        }
    }
    public static int getBucketCount(double area, double areaPerDouble){
        if(area <= 0 || areaPerDouble <= 0 ){
            return -1;
        }
        else{
            double bucketsNeeded = Math.ceil(area / areaPerDouble);
            return (int)bucketsNeeded;
        }
    }

}
