package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isValid(33));
    }
    public static boolean hasSameLastDigit(int x, int y, int z){
        if(x<10 || x > 1000 || y<10 || y > 1000 || z<10 || z > 1000){
            return false;
        }
        else{
            int xld = x%10;
            int yld = y%10;
            int zld = z%10;
            if(xld == yld || xld == zld || yld == zld){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public static boolean isValid(int x){
        if(x<10 || x > 1000 ){
            return false;
        }
        else{
            return true;
        }
    }
}
