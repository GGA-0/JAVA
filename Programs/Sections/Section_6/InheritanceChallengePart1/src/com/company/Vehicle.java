package com.company;

public class Vehicle {
    private int currentSpeed;
    private int carryingCapacity;

    public Vehicle(int carrryingCapacity){
        this.currentSpeed = 0;
        this.carryingCapacity = carrryingCapacity;
    }
    //Current Speed getter and setter
    public int getCurrentSpeed(){
        return currentSpeed;
    }
    public void setCurrentSpeed(int currentSpeed){
        this.currentSpeed = currentSpeed;
    }

    //Carrying Capacity getter and setter
    public int getCarryingCapacity(){
        return carryingCapacity;
    }
    public void setCarryingCapacity(int carryingCapacity){
        this.carryingCapacity = carryingCapacity;
    }

}
