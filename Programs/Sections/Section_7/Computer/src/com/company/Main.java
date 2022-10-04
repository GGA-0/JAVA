package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20 , 5);
	    Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        //version 1
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getTheCase().pressPowerButton();
        thePC.getMonitor().drawPixelAt(5,5,"blue");
        thePC.getMotherboard().loadProgram("Windows 1.0");

        System.out.println();

        //version 2
        thePC.powerUp();




    }
}
