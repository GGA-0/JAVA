package com.company;

public class Wall {
    private double width;
    private double height;

    //constructors
    public Wall(double width, double height) {
        if(width>=0){
            this.width = width;
        }
        if(width<0){
            this.width = 0;
        }
        if(height>=0){
            this.height = height;
        }
        if(height<0){
            this.height = 0;
        }
    }
    public Wall() {
        this(0,0);
    }

    //getters
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }

    //setters
    public void setWidth(double width){
        if(width>=0){
            this.width = width;
        }
        if(width<0){
            this.width = 0;
        }
    }
    public void setHeight(double height){
        if(height>=0){
            this.height = height;
        }
        if(height<0){
            this.height = 0;
        }
    }

    public double getArea(){
        return getWidth() * getHeight();
    }
}
