import java.util.Scanner;

public class Ejercicio4 {

    public static void main (String[] args){
        Scanner lector = new Scanner(System.in);
        double precioBocatas = 2.05;
        double precioBebidas = 1.25;
        System.out.println("cuantas bebidas quieres: ");
        int nBebidas = lector.nextInt();
        System.out.println("Cuantos bocatas quieres: ");
        int nBocatas = lector.nextInt();
        lector.close();
        double costeBebidas = nBebidas*precioBebidas;
        double costeBocatas = nBocatas*precioBocatas;
        double costeTotal = costeBocatas+costeBebidas;

        System.out.printf("El coste de las bebidas es de %.2f\n",costeBebidas);
        System.out.printf("El coste de los bocatas es de %.2f\n ",costeBocatas);
        System.out.printf("El coste total es de %.2f\n",costeTotal);






    }
}
