import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main (String[] args){

        Scanner lector = new Scanner(System.in);
        System.out.println("Indique su nombre completo: ");
        String nombre = lector.nextLine();
        System.out.println("Indique su dirección: ");
        String direccion = lector.nextLine();
        System.out.println("Indique numero y piso: ");
        String numeroPiso = lector.nextLine();
        System.out.println("Indique codigo postal: ");
        int codigoPostal = lector.nextInt();
        lector.nextLine();
        System.out.println("Indique la ciudad y el pais: ");
        String ciudadPais = lector.nextLine();


        System.out.println(""+nombre);
        System.out.println(""+direccion);
        System.out.println(""+numeroPiso);
        System.out.println(""+codigoPostal);
        System.out.println(""+ciudadPais);


    }
}
