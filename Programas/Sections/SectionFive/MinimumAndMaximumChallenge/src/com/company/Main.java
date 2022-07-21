package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int y = 0;
        int z = 0;
        while(true){
            System.out.println("Enter number");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int x = scanner.nextInt();

                if(counter == 0){
                    y = x;
                    z = x;
                }
                else if(x<y){
                    y=x;
                }
                else if(x>z){
                    z=x;
                }
            }
            else{
                break;
            }
            scanner.nextLine();
            counter+=1;
        }
        scanner.close();
        System.out.println(y + " " + z);
    }
}
