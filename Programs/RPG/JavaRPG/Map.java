import java.util.Scanner;

public class Map {
    private static int x = 5;
    private static int y = 5;

    public static void main(String[] args) {
        Map();
    }

    public static void Map(){
        switch (x & y) {
            case 5 & 5: 
                x5y5();
                break;
        
            default:
                break;
        }
    }
    private static void x5y5(){
        System.out.println("Você está em uma sala escura");
        System.out.println("diante de você está um duende");
        System.out.println("");
        System.out.println("(Todos os monstros aqui do jogo são meramente outra raça de humanos)");
        System.out.println("Se você acha que duende, lizardman, slime tem magia...");
        System.out.println("Saiba que esses aqui não tem poder de nenhuma forma, são apenas serezinhos que eu criei, não vem botar coisa de magia no meu trabalho não");
        System.out.println("Também, sinta-se a vontade para mata-los, aliás eu que criei eles, kkkkkk, boa experiência de jogo pra vc");
        System.out.println("");
        System.out.println("O que você deseja fazer?");

        where(true, true, false, true);
    } 
    private static void where(boolean north, boolean south, boolean east, boolean west){
        boolean again = true;

        while(again){               
            System.out.println("Você pode se mover ");
            if(north){
                System.out.print("ou para o norte ");
            }
            if(south){
                System.out.print("ou para o sul ");
            }
            if(east){
                System.out.print("ou para o leste ");
            }
            if(west){
                System.out.print("ou para o oeste ");
            }
            String direction = Main.sc.nextLine();
            
            switch (direction) {
                case "norte":
                    if(north){
                        y += 1;
                        again = false;
                    }
                    else{
                        System.out.println("Você digitou uma direção inválida");
                        System.out.println("");
                    }
                    break;
                case "sul":
                    if(south){
                        y -= 1;
                        again = false;
                    }
                    else{
                        System.out.println("Você digitou uma direção inválida");
                        System.out.println("");
                    }
                    break;
                case "leste":
                    if(west){
                        x += 1;
                        again = false;
                    }
                    else{
                        System.out.println("Você digitou uma direção inválida");
                        System.out.println("");
                    }
                    break;
                case "oeste":
                    if(east){
                        x -= 1;
                        again = false;
                    }
                    else{
                        System.out.println("Você digitou uma direção inválida");
                        System.out.println("");
                    }
                    break;
                default:
                    System.out.println("Você digitou uma direção inválida");
                    System.out.println("");
                    break;
            }
        }
    }
}

