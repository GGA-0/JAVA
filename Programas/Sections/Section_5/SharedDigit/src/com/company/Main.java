package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(25,37));
    }
    public static boolean hasSharedDigit(int x, int y){
        if (x >= 10 && x <= 99 && y >= 10 && y <= 99){
            int x1 = (x - x%10)/10;
            int x2 = x%10;
            int y1 = (y - y%10)/10;
            int y2 = y%10;
            if(x1==y1 || x1 == y2 || x2==y1 || x2 == y2 ){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
