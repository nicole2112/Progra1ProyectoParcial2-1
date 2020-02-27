
package progra1proyecto2;
import java.util.Scanner;

public class Progra1Proyecto2 {

    public static void main(String[] args) {
       Scanner lea = new Scanner(System.in);
       int posicion =0;
       int conteo;
       while(true){
       
       Player();
       System.out.print("Ingrese posicion: ");
       posicion = lea.nextInt();
       System.out.println(Player.jugador[posicion]);
       }
    }
    
}
