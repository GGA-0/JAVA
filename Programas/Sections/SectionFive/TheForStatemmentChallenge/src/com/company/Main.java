package com.company;

public class Main {

    public static void main(String[] args) {
        //for (int i = 8; i > 1; i--) {
        //    System.out.println("10,000 at an " + i + "% interest = " + calculateInterest(10000, i));
        //}

        int x = 1;
        for (int i = x; i < x+x; i++){
            //System.out.println(isPrime(x));
            if (isPrime(x) == true){
                System.out.println(x + " é primo");
                x++;
            }
            else if (isPrime(x) == false){
                //System.out.println(x + " não é");
                x++;
            }

        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }


//second part of the challenge

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for(int i=2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}