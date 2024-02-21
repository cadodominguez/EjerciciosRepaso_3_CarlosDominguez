
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
                    brazil.nextLine();
                    System.out.println("Ingrese una cadena : ");
                    String cad1 = brazil.nextLine();
                    System.out.println("Ingrese una cadena : ");
                    String cad2 = brazil.nextLine();
                    String mayor;
                    String menor;
                    if (cad1.length() > cad2.length()){
                        mayor = cad1;
                        menor = cad2;
                    }else{
                        mayor = cad2;
                        menor = cad1;
                    }
                    String comp = "";
                    String rev1;
                    for (int i = 0; i < menor.length(); i++) {
                        for (int j = 0; j < mayor.length(); j++){
                            if (menor.charAt(i) == mayor.charAt(j)) {
                                rev1 = mayor.charAt(j) + "";
                                if (comp.contains(rev1)) {
                                    comp += "";
                                }else{
                                    comp += mayor.charAt(j);
                                }
                            }
                        }
                    }
                    if (comp.equals(menor)) {
                        System.out.println("Si se puede armar " + menor);
                    }else{
                        System.out.println("No se puede armar " + menor);
                    }
                    break;
                case 2:
                    brazil.nextLine();
                    System.out.println("Ingrese una cadena que contenga numero y letras: ");
                    String cadnumylet = brazil.nextLine();
                    String nums = "";
                    String letras = "";
                    for (int i = 0; i < cadnumylet.length(); i++) {
                        if (cadnumylet.charAt(i)>=48 && cadnumylet.charAt(i) <= 57) {
                            nums += cadnumylet.charAt(i);
                        }else{
                            letras += cadnumylet.charAt(i);
                        }
                    }
                    String numerosprimero = nums + letras;
                    System.out.println("La cadena modificada es : " + numerosprimero);
                    System.out.println("");
                    break;
                case 3:
                    
                    break;
                case 4:
                    brazil.nextLine();
                    System.out.println("Ingrese la cadena a codificar : ");
                    String sincod = brazil.nextLine();
                    String codificada = codificacion (sincod);
                    System.out.println("Cadena Codificada : ");
                    System.out.println(codificada);
                    System.out.println("");
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
    
    public static String codificacion (String cadIngresada){
        String temporal = "";
        for (int i = 0; i < cadIngresada.length(); i++) {
            if (cadIngresada.charAt(i) == ' ') {
                temporal += " ";
            } else if (cadIngresada.charAt(i)>=48 && cadIngresada.charAt(i) <= 57){
                if (i == 0 || cadIngresada.charAt(i-1) == ' '){
                     temporal += "";
                }else{
                    temporal += "-";
                }
                switch (cadIngresada.charAt(i)) {
                    case '1':
                        temporal += "A";
                        break;
                    case '2':
                        temporal += "B";
                        break;
                    case '3':
                        temporal += "C";
                        break;
                    case '4':
                        temporal += "D";
                        break;
                    case '5':
                        temporal += "E";
                        break;
                    case '6':
                        temporal += "F";
                        break;
                    case '7':
                        temporal += "G";
                        break;
                    case '8':
                        temporal += "H";
                        break;
                    case '9':
                        temporal += "I";
                        break;    
                }
            }else if (cadIngresada.charAt(i)>=97 && cadIngresada.charAt(i) <= 122){
                if (i == 0 || cadIngresada.charAt(i-1) == ' '){
                     temporal += "";
                }else{
                    temporal += "-";
                }
                temporal += cadIngresada.charAt(i) - 96;
            }   
        }
        return temporal;
    }
    
}
