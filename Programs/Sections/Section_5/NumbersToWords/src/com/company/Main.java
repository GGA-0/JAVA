package com.company;

public class Main {

    public static void main(String[] args) {
        numberToWords(1100);
    }
    public static void numberToWords(int x){

        if(x < 0){
            System.out.println("Invalid Value");
        }

        int reverse = reverse(x);
        for (int i = 0; i < getDigitCount(x); i++) {
            switch (reverse % 10){
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    break;
            }
            reverse/=10;

        }
        System.out.println();
    }

    public static int reverse(int x) {

        int reverseNumber = 0;

        while (x != 0) {
            reverseNumber = (reverseNumber * 10) + (x % 10);
            x /= 10;
        }
        return reverseNumber;
    }
    public static int getDigitCount(int x){
        int count = 0;
        if (x<0){
            count = -1;
        }
        else{
            if (x<10){
                count = 1;
            }
            else if (x < 100){
                count = 2;
            }
            else if (x < 1000){
                count = 3;
            }
            else if (x < 10000){
                count = 4;
            }
            else if (x < 100000){
                count = 5;
            }
            else if (x < 1000000){
                count = 6;
            }
            else if (x < 10000000){
                count = 7;
            }
            else if (x < 100000000){
                count = 8;
            }
            else if (x < 1000000000){
                count = 9;
            }

        }
        return count;
    }
}
