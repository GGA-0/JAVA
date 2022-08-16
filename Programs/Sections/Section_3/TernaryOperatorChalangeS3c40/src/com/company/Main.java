package com.company;

public class Main {

    public static void main(String[] args) {
        double x = 20;
        double y = 80;
        double z = (x + y) * 100;
        double a = z % 40;

        boolean ehZero = (a == 0) ? true : false;

        if (ehZero) {
            System.out.println(ehZero);
        }
        else{
            System.out.println("Got some remainder");
        }


        }
    }

