package com.company;

public class Main {

    public static void main(String[] args) {
	Sentra myCar = new Sentra(4,4,"V8");
    myCar.switchCurrentGear(2);
        System.out.println("Current speed: " + myCar.getCurrentSpeed());
        System.out.println("Current gear: " + myCar.getCurrentGear());
    }
}
