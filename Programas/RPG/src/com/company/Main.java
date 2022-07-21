package com.company;

import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Character GGA = new Character();
        battle();
    }

    public static void battle(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Uma batalha está prestes a se iniciar");
        System.out.println();

        for(int i = 0; i<5; i++){

        }
        while (true){
            System.out.println("Sua vez de atacar! Onde deseja atacar primeiro? (cima/meio/baixo)");
            String posicion = scanner.nextLine();
            int ran = random(1,3);
            if(posicion.equals("cima")){
                if(ran==1){
                    System.out.println("Ataque defendido");
                }
            }
            else if(posicion.equals("meio")){
                if(ran==2){
                    System.out.println("Ataque defendido");
                }
            }
            else if(posicion.equals("baixo")){
                if(ran==3){
                    System.out.println("Ataque defendido");
                }
            }
        }
    }

    public static int random(int min, int max){
        Random ran = new Random();
        return ran.nextInt((max - min) + 1)+min;
    }
}
