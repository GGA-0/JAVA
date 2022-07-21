package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        do {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("\nEnter year");

            int x = myObj.nextInt();  // Read user input
            System.out.println(isLeapYear(x));
        }while(0==0);
    }
    public static boolean isLeapYear(int year){
        boolean x = true;
        if(year <= 1 || year >= 9999){
            x = false;
        }
        else if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    x= true;
                }else
                    x = false;
            }else{
                x = true;
            }
        }else{
            x = false;
        }
        return x;
    }
}
