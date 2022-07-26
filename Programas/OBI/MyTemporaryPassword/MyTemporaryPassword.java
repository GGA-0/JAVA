package Programas.OBI.MyTemporaryPassword;

import java.util.Scanner;

public class MyTemporaryPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] string = new String[n];

        for(int i = 0; i<n; i++){
            string[i] = scanner.nextLine();
            if(string[i].charAt(0) != 'R' || string[i].charAt(1) != 'A'){
                string[i] = "INVALID DATA";
            }
            else if(string[i].length() != 20){
                string[i] = "INVALID DATA";
            }
            else{

                for(int j = 0; j < 20; j++){
                    if(string[i].charAt(j) != '0' && string[i].charAt(j) != 'R' && string[i].charAt(j) != 'A'){
                        string[i] = string[i].substring(j, 20);
                        break;

                    }
                }
                
            }
        }
        for(String i : string){
            System.out.println(i);
        }
        scanner.close();
    }
}
