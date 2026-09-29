import java.util.Scanner;

public class Ejercicio3 {

    public static void main (String[] args){

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce el primer operando: ");
        int operando1 = lector.nextInt();
        System.out.println("Introduce el segundo operando: ");
        int operando2 = lector.nextInt();
        int suma = operando1+operando2;
        int resta = operando1-operando2;
        int multiplicacion = operando1*operando2;
        int division = operando1/operando2;
        int modulo = operando1%operando2;
        double diviReal = operando1/operando2;
        double moduReal = operando1%operando2;
        System.out.println("La suma de los valores es: "+suma);
        System.out.printf("La resta de %d y de %d es %d\n",operando1,operando2,resta);
        System.out.printf("La multiplicacion de %d y de %d es %d\n",operando1,operando2,multiplicacion);
        System.out.printf("La division de %d y de %d es %d\n",operando1,operando2,division);
        System.out.printf("El modulo de %d y de %d es %d\n",operando1,operando2,modulo);
        System.out.printf("El division real de %d y de %d es %.1f\n",operando1,operando2,diviReal);
        System.out.printf("El division real de %d y de %d es %.2f\n",operando1,operando2,moduReal);






    lector.close();
    }

}
