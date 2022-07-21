package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(8, 6));
    }

    public static int getGreatestCommonDivisor(int x, int y){
        int divisor = 1;
        int gmc = 0;
        if(x<10 || y<10){
            gmc = -1;
        }
        else{
            while(true){
                if(divisor>x || divisor >y){
                    break;
                }
                if(x % divisor == 0 && y % divisor == 0){
                    if(divisor>x || divisor>y){
                        break;
                    }
                    gmc = divisor;
                    divisor++;
                }
                else{
                    divisor++;
                }
            }
        }

        return gmc;
    }
}
