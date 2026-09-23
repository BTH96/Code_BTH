import java.util.Scanner;

public class Entrada {



    public static void main (String[] args){

        System.out.println("Programa para explicar los operadores");
        //Scanner permite realizar lecturas por teclado
        Scanner lector = new Scanner(System.in);
        System.out.println("Indicame tu nombre");
        //Dependiendo del tipo de dato que quieras leer la variable lector tiene metodos para ello.
        String nombre = lector.nextLine();
        System.out.println("En que ciclo te has matriculado");
        String ciclo = lector.nextLine();
        System.out.println("Que nota quieres sacar de media");
        int media = lector.nextInt();
        System.out.println("Nombre: "+nombre);
        System.out.println("Ciclo: "+ciclo);
        System.out.println("media: "+media);
    }
}
