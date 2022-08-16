package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2,2021));
    }
    public static boolean isLeapYear(int year){
        boolean x = true;
        if(year <= 1 || year >= 9999){
            x = false;
        }
        else if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    x= true;
                }else
                    x = false;
            }else{
                x = true;
            }
        }else{
            x = false;
        }
        return x;
    }
    public static int getDaysInMonth (int month, int year){
        //leap year code
        boolean x = true;
        if(year <= 1 || year >= 9999){
            x = false;
        }
        else if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    x= true;
                }else
                    x = false;
            }else{
                x = true;
            }
        }else{
            x = false;
        }

        //days in month code
        int days = 0;
        if (month < 1 || month > 12 || year <1 || year > 9999){
            days = -1;
        }
        else{
            switch (month){
                case 4, 6, 9, 11:
                    days = 30;
                    break;
                case 1, 3, 5, 7, 8, 10, 12:
                    days = 31;
                    break;
                case 2:
                    if(x){
                        days = 29;
                    }else{
                        days = 28;
                    }
                    break;
            }
        }
        return days;
    }
}
