import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Indica el precio de la compra");
        double compra = lector.nextDouble(); // cuando meto info por teclado el decimal es una , pero si es aqui en IDE es en .
        System.out.println("Cual a sido el porcentaje de IVA que has pagado: ");
        int IVA= lector.nextInt();
        double costeIVA = compra * ((double) IVA /100);
        double costeSinIVA  = compra-costeIVA;
        System.out.printf("La compra han sido %.2f\n",compra);
        System.out.printf("la compra sin IVA han sido %.2f\n",costeSinIVA);
        System.out.printf("El IVA  a sido %.2f\n",costeIVA);





    }
}
