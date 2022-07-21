package com.company;

public class Main {

    public static void main(String[] args) {
            for(int i=2; i<=i+1000; i++){
                if(isPrime(i)){
                    System.out.println(i);
                }
                else{

                }
            }
        }
    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;

    }


}
