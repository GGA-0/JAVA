import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        // Health, coins, weapon 
        int[] Player = new int[3]; 
        Player[0] = 20;
        Player[1] = 10;
        Player[2] = 1;

        // while(true){
        //     Player = shop(Player[1], Player[2]);   
        // }
    }
    public static int attack(int weapon){
        Random random = new Random();
        return random.nextInt(Weapons.getMax(weapon) + 1 - Weapons.getMin(weapon)) + Weapons.getMin(weapon);
    }
    public static int[] shop(int coins, int weapon){
        Scanner sc = new Scanner(System.in);
        int[] store = new int[3];
        store[1] = coins;
        store[2] = weapon;

        String buy;

        System.out.println("Do you want to buy a weapon?" );
        System.out.println("Sword - 1 coin" );
        System.out.println("Long Sword - 2 coins");
        System.out.println("Heavy Hammer - 3 coins");
        buy = sc.nextLine();


        switch (buy) {
            case "Sword":
                store[1] -= 1;
                store[2] = 2;
                break;

            case "Long Sword":
                store[1] -= 2;
                store[2] = 3;
                break;

            case "Heavy Hammer":
                store[1] -= 3;
                store[2] = 4;
                break;
        
            default:
                break;
        
        sc.close();
        return store;
    }
}