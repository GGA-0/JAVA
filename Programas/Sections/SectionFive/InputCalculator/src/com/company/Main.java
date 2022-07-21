package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double avg = 0;
        double count = 0;
        while(true){
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                sum += scanner.nextInt();
                count += 1;
                avg = sum / count;
            }
            else {
                if(avg - (int)avg == 0){
                    System.out.println("SUM = " + (int)sum +  " AVG = " + (int)avg);
                    break;
                }
                else{
                    System.out.println("SUM = " + (int)sum +  " AVG = " + avg);
                    break;
                }
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
