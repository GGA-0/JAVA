package com.company;

public class Main {

    public static void main(String[] args) {
	    int plUm = calculateHighScorePosition(1500);
        int plDois = calculateHighScorePosition(900);
        int plTres = calculateHighScorePosition(400);
        int plQuatro = calculateHighScorePosition(50);

        displayHighScorePosition("Joâo", plUm);
        displayHighScorePosition("Matheus", plDois);
        displayHighScorePosition("Pedro", plTres);
        displayHighScorePosition("Lucas", plQuatro);

    }
    public static void displayHighScorePosition(String playerName, int position){
        System.out.println("\n" + playerName + " managed to get in position " + position + " on the high score table");
    }
    public static int calculateHighScorePosition(int playerScore){

        int position = 0;
        if(playerScore >= 1000){
            position = 1;
        }
        else if(playerScore >= 500 && playerScore < 1000){
            position = 2;
        }
        else if(playerScore >= 100 && playerScore < 500){
            position = 3;
        }
        else{
            position = 4;
        }
        return position;
    }
}
