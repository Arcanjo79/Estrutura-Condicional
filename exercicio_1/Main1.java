import java.util.Scanner;

public class Main1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int X;
        
        X = sc.nextInt();
        
        if (X < 0) {
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("NÃO NEGATIVO");
        }




        sc.close();

    }
}