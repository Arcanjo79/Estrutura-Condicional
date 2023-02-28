import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    
    if (A % B == 0 || B % A == 0) { // antes feito: (A * x == B) pois eu não sabia que tinha como colocar na mesma condição duas hipoteses!
        System.out.println("São Múltiplos");
    }                                                                                          
    else {
        System.out.println("Não são Múltiplos");
    }
    
 
    sc.close();
 }


}
