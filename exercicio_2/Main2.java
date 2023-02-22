import java.util.Scanner;

public class Main2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();

        if (x % 2 == 0) { // Um número dividido por dois contendo resto zero é par, por isso a formula fica assim.
            System.out.println("PAR");
        } 
        else {
            System.out.println("IMPAR");
        }


    sc.close();

    }
    
}
