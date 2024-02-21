
package tarea3repaso_carlosdominguez;
import java.util.Scanner;
public class Tarea3Repaso_CarlosDominguez {
    
    static Scanner brazil = new Scanner (System.in);
    
    public static void main(String[] args) {
        boolean out = true;
        do {
            System.out.println("**********MENU**********");
            System.out.println("1.Veamos si podemos formar la palabra");
            System.out.println("2.Numeros primero");
            System.out.println("3.Ordenar alfabeticamente");
            System.out.println("4.Codificar cadenas");
            System.out.println("5.Jugando con arreglos");
            System.out.println("6.Salir");
            int opcion = brazil.nextInt();
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                   
                    break;
                case 5:
                    
                   break;
                case 6:
                    System.out.println("Saliendo......");
                    out = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            } 
        } while (out);
    }
    
}
