package com.company;

public class Main {

    public static void main(String[] args) {
        printConversion(95.75);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            double MilesPerHour = kilometersPerHour / 1.609;;
            double MilesPerHourRounded = Math.round(MilesPerHour);
            long MilesPerHourRoundedLong = (long) MilesPerHourRounded;
            return MilesPerHourRoundedLong;
        }
    }
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        else {
            double MilesPerHour = kilometersPerHour / 1.609;
            System.out.println(kilometersPerHour + " km/h = " + Math.round(MilesPerHour) + " mi/h ");
        }
    }
}
