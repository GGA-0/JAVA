package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(23456));
    }
    public static int getEvenDigitSum(int number){
        int sum = 0;
        if(number<0){
            sum = -1;
        }
        else{
            while(true){
                if (number ==0){
                    break;
                }
                if (number%2==0){
                    sum += number%10;
                    number -= number%10;
                    number /= 10;
                }
                else{
                    number -= number%10;
                    number /= 10;
                }
            }
        }
        return sum;
    }
}
