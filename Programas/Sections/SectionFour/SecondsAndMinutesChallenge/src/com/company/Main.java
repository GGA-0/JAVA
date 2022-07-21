package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("");
    }
    public static void getDurationString(int minutes, int seconds){
        if (minutes >= 0 && seconds >= 0 ){
            seconds = (minutes * 60) + seconds;
            if(seconds <= 59){
                System.out.println("00h 00m " + seconds + "ss");
            }
            else{
                if(seconds <= 3599){
                    minutes = seconds / 60;
                    seconds = seconds % 60;
                    System.out.println("00h "+ minutes +"m " + seconds + "s");
                }
                else{
                    int hours = seconds / 3600;
                    seconds = seconds % 3600;
                    minutes = seconds / 60;
                    seconds = seconds % 60;
                    System.out.println(hours + "s "+ minutes +"m " + seconds + "s");
                }
            }
        }
        else{
            System.out.println("Invalid value");
        }
    }
}
