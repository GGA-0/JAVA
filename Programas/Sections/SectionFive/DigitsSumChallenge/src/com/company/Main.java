package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(2468));
    }
    public static int sumDigits (int number){
        if (number <= 10){
            return -1;
        }
        else{
            int sum = 0;
            int lastDgt = 0;
            int num = number;
            for(int i = 1; i != i + 10; i++){
                lastDgt = num % 10;
                sum = sum + lastDgt;
                num = num - (num % 10);
                num = num / 10;

                if (num <= 0){
                    break;
                }
            }
            return sum;
        }
    }
}
