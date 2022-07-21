package com.company;

public class Floor {
    private double length;
    private double height;

    public Floor(double length, double height) {
        if(length>=0){
            this.length = length;
        }
        else if(length<0){
            this.length = 0;
        }
        if(height>=0){
            this.height = height;
        }
        else if(height<0){
            this.height = 0;
        }
    }
    public double getArea(){
        return this.height * this.length;
    }
}
