import java.util.Scanner;

public class Ejercicio2 {

    public static void main (String[] args){

        Scanner lector = new Scanner(System.in);

        System.out.println("Escribe tu nombre completo: ");
        String nombreCompleto = lector.nextLine();

        System.out.println("Escribe tu edad: ");
        int edad = lector.nextInt();

        System.out.printf("Te llamas %s y tienes %d años\n",nombreCompleto,edad);
        System.out.println("Pulse enter para continuar...");


    }

}
