package com.company;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(0);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes >= 0) {
            int days = (int) minutes / 60 / 24;
            if (days > 364) {
                int daysR = days % 365;
                int years = (int) minutes / 60 / 24 / 365;
                System.out.println(minutes + " min = " + years + " y and " + daysR + " d");
            }
            else{
                int years = 0;
                System.out.println(minutes + " min = " + years + " y and " + days + " d");
            }

        }
        else{
            System.out.println("Invalid Value");
        }
    }
}