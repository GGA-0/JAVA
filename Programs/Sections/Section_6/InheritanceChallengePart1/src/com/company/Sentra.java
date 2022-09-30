package com.company;

public class Sentra extends Car{
    private boolean sedan = true;

    public Sentra(int carrryingCapacity,int wheels, String engine) {
        super(carrryingCapacity, wheels, engine);
        this.sedan = true;
    }
    public boolean isSedan() {
        return sedan;
    }
}
