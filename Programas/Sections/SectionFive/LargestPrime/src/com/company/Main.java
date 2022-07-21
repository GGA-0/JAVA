package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(700));
    }
    public static int getLargestPrime(int number){
        if(number<=1){
            return -1;
        }
        int largestPrime=0,x=0;
        for(int i=2;i<=(number/2);i++){
            if(number%i==0){
                x=getLargestPrime(i);
                if(x<=i){
                    largestPrime=x;
                } else{
                    largestPrime=i;
                }
            }

        }

        if(largestPrime==0){
            largestPrime=number;
        }
        return largestPrime;
    }
}
