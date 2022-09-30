package com.company;

public class Car extends Vehicle{
    private int wheels;
    private String engine;
    private int currentGear;

    public Car(int carrryingCapacity, int wheels, String engine) {
        super(carrryingCapacity);
        this.wheels = wheels;
        this.engine = engine;
        this.currentGear = 0;
    }

    //getters
    public int getWheels() {
        return wheels;
    }
    public String getEngine() {
        return engine;
    }
    public int getCurrentGear() {
        return currentGear;
    }
    //setters
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public void handSteering(){
        System.out.println("You can conduce the vehicle by turning the steering wheel");
    }
    public void switchCurrentGear(int currentGear){
        setCurrentGear(currentGear);
    }
}
