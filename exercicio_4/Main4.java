import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       int HoraFinal= sc.nextInt();
       int HoraInicial = sc.nextInt();

       int TempoTotal;
    

        if (HoraFinal > HoraInicial) {
            TempoTotal = HoraFinal - HoraInicial;
        }
        else{
            TempoTotal = 24 - HoraInicial + HoraFinal;
        }

        System.out.println("O JOGO DUROU " + TempoTotal + " HORA(S)" );

 
        





sc.close();
    }
    
}
