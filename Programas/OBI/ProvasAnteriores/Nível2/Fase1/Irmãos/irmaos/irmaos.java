import java.util.Scanner;
public class irmaos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int imn = scanner.nextInt();
        scanner.nextLine();
        int otavio = scanner.nextInt();

        int imv = otavio + (otavio-imn);

        System.out.println(imv);

        scanner.close();
    }
}
