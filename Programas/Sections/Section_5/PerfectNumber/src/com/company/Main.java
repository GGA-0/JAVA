package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(7));
    }

    public static boolean isPerfectNumber(int x){
        if(x > 1) {
            int sum = 0;
            for (int i = 1; i < x; i++) {
                if (x % i == 0) {
                    sum += i;
                }
            }
            if (sum == x) {
                return true;
            } else {
                return false;
            }
        }
        else{
            return false;
        }
    }
}
