import java.util.Random;
import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int[] inventory = new int[5];

    public static void main(String[] args) {
        Random random = new Random();
        //Incialização do player
        // Health, coins, weapon 
        int[] Player = new int[3]; 
        Player[0] = 20;
        Player[1] = 10;
        Player[2] = 1;
        inventory[1] = 1;

        while (true) {
            for(int h = 0; h<5; h++){
                System.out.println("");
            }
            System.out.println("");
            System.out.println("What would you like to do now?      coins: " + Player[1]);       
            System.out.println("______________________________");
            System.out.println("     Access inventory (1)           weapon: " + Weapons.getWeaponName(Player[2]) + "(" + Weapons.getMin(Player[2]) + "-" + Weapons.getMax(Player[2]) +")");
            System.out.println("______________________________");
            System.out.println("           Shop (2)           ");
            System.out.println("______________________________");
            System.out.println("          Battle (3)          ");
            System.out.println("______________________________");
            System.out.println("");
            System.out.println("Type your option: ");
            int option = sc.nextInt();
            sc.nextLine();

            for(int h = 0; h<5; h++){
                System.out.println("");
            }

            switch(option){
                case 1:
                    Player = inventory(Player[0], Player[1], Player[2]); 
                    break;
                case 2:
                    Player = shop(Player[0], Player[1], Player[2]); 
                    break;
                case 3:
                    break;
                    
            }

        }
    }
    public static int attack(int weapon){
        Random random = new Random();
        return random.nextInt(Weapons.getMax(weapon) + 1 - Weapons.getMin(weapon)) + Weapons.getMin(weapon);
    }
    //*****Inventário*****
    public static int[] inventory(int health, int coins, int weapon){
        int[] player = new int[3];
        player[0] = health;
        player[1] = coins;
        player[2] = weapon;
        System.out.println("Armas disponíveis: ");
        for(int i = 0; i<5; i++){
            if(inventory[i] == 1){
                System.out.println(Weapons.getWeaponName(i) + "(" + Weapons.getMin(i) + "-" + Weapons.getMax(i) +")("+ i +")");
            }            
        }
        System.out.println("");
        System.out.println("Deseja trocar de arma?(s/n)");
        String sn = sc.nextLine();
        if(sn.equals("s")){
            System.out.println("Escolha a arma que deseja equipar");
            int chooseWeapon = sc.nextInt();
            sc.nextLine();
            if(inventory[chooseWeapon] == 1){
                System.out.println(Weapons.getWeaponName(chooseWeapon) + "(" + Weapons.getMin(chooseWeapon) + "-" + Weapons.getMax(chooseWeapon) +") foi selecionado(a)");
                player[2] = chooseWeapon;
            }
            else{
                System.out.println("Arma indisponível");
            }
        }
        return player;
    }

    //*****Loja*****
    public static int[] shop(int health, int coins, int weapon){
        int[] player = new int[3];
        player[0] = health;
        player[1] = coins;
        player[2] = weapon;
        int buy;
        System.out.println("______________________________");
        System.out.println("Do you want to buy a weapon?        coins: " + player[1]);
        System.out.println("______________________________");
        System.out.println("Sword(2) - 2 coins" );
        System.out.println("______________________________");
        System.out.println("Long Sword(3) - 3 coins");
        System.out.println("______________________________");
        System.out.println("Heavy Hammer(4) - 4 coins");
        System.out.println("______________________________");
        System.out.println("Type your option(0: quit): ");
        buy = sc.nextInt();
        switch (buy) {
            case 2:
                if(player[1] - 2 >= 0){
                    player[1] -= 2;
                    inventory[2] = 1;
                }else{
                    System.out.println("Moedas insuficientes!");
                }
                break;
            case 3:
                if(player[1] - 3 >= 0){
                    player[1] -= 3;
                    inventory[3] = 1;
                }else{
                    System.out.println("Moedas insuficientes!");
                }
                break;
            case 4:
                if(player[1] - 4 >= 0){
                    player[1] -= 4;
                    inventory[4] = 1;
                }else{
                    System.out.println("Moedas insuficientes!");
                }
                break;
        
            default:
                break;
        }
        return player;
    }

}