import java.util.Scanner;
public class acelerador{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        d -= 3;
        d %= 8;

        int s = 0;

        if(d == 3){
            s = 1;
        }
        if(d == 4){
            s = 2;
        }
        if(d == 5){
            s = 3;
        }

        System.out.println(s);

        scanner.close(); 
    }
}