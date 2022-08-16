import java.util.Scanner;
public class camisetas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //linha 1
        int premiados = scanner.nextInt();
        scanner.nextLine();

        //linha 2
        String sNums = scanner.nextLine();  

        String[] num = sNums.split(" ");    
        int[] numbers = new int[num.length];   
      
        for (int i = 0; i < num.length; ++i)    
        {    
          numbers[i] = Integer.valueOf(num[i]);    
        } 

        //linha 3
        int p = scanner.nextInt();
        scanner.nextLine();

        //linha 4
        int m = scanner.nextInt();
        scanner.nextLine();

        int pc = 0;
        int mc = 0;

        for (int i : numbers){
            if (i == 1){
                pc+=1;
            }
            if(i == 2){
                mc+=1;
            }
        }

        if(pc == p && mc == m){
            System.out.println("S");
        }
        else{
            System.out.println("N");
        }

        scanner.close();
    }
}