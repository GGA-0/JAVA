import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String x = scanner.nextLine();
        String[] y = x.split(" "); 
        int[] z = new int[y.length];

        for(int i = 0; i<y.length; i++){
            z[i] = Integer.valueOf(y[i]);
        }

        for(int i : z){
            System.out.print(i);
        }

        scanner.close();

    }
}
