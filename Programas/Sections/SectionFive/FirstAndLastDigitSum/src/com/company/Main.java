package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(33));
    }
    public static int sumFirstAndLastDigit(int number){
        int sum = 0;
        if (number<0){
            sum = -1;
        }
        else{
            int count = 0;
            while (true){
                if(number <=9){
                    if(count == 0 && number<=10) {
                        number *= 2;
                    }
                    sum += number;
                    break;
                }
                else if (count == 0 && number>=10){
                    sum += number % 10;
                    number = (number-(number%10))/10;
                }
                else{
                    number = (number-(number%10))/10;
                }
                count++;
            }
        }
        return sum;
    }
}
