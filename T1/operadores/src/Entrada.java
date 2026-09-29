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

        int operador1 = 4;
        int operador2 = 8;
        int suma = operador1+operador2;
        int resta = operador1-operador2;
        int multiplicacion = operador1*operador2;
        double division = (double) operador1/operador2;

        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);

        int resto = 5%2;

        String numero = "5";
        String numero2 = "6";

        operador1 = 10;
        operador2 = 11;
        operador1++;
        operador2--;

        //Esto sirve para sumar o restar 1 cada que lo pongas

        // sumar 14 al operador 1

        operador1 = operador1 +14;
        operador1 += 14; //25
        operador2 -=10;// 0
        operador1 *=2;
        operador1 %=2; //

        System.out.println("el valor despues de haber operado es: "+operador1);
        System.out.println("el valor despues de haber operado es: "+operador2);


        operador1 = 10;
        operador2 = 50;

        boolean comparacion = operador1>operador2;
        System.out.println("La comparacion es: "+comparacion);
        comparacion = operador1>=operador2;
        System.out.println("La comparacion es: "+comparacion);
        comparacion = operador2<operador1;
        System.out.println("la comparacion es: "+comparacion);
        comparacion = operador2<=operador1;
        System.out.println("la comparacion es: "+comparacion);
        comparacion = operador1 == operador2;
        System.out.println("la comparacion es: "+comparacion);
        comparacion = operador1 != operador2;
        System.out.println("la comparacion es: "+comparacion);

        String palabra1 = "Programacion";
        String palabra2 = "programacion";

        boolean compararPalabras = palabra1.equals(palabra2);
        compararPalabras = palabra1.equalsIgnoreCase(palabra2);
        System.out.println("la comparacion de palabras es: "+compararPalabras);

        boolean compararpalabrasIguales = !palabra1.equalsIgnoreCase(palabra2); // Si le pongo el ! antes del palabra1 cambia el valor del booleano.
        System.out.println("la comparacion de palabras es: "+compararpalabrasIguales);

        // Logicos o sentencias && ||

        //&& es un AND y || es un OR
        operador1 = 10;
        operador2 = 20;

        comparacion = operador1 > 0 && operador2 < 0;
        System.out.println("cual es el resultado de las compararciones: "+comparacion);

        boolean comparacionAND = operador2 > 0 && operador1 < 10;
        boolean comparacionOR = operador1 < 10 || (operador2<20 && operador1*2 >=operador2);



    }

}
