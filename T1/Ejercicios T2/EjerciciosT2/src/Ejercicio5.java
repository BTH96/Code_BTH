import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        System.out.println("que cantidad de segundos quieres pasar a h:m:s");
        int segundosSistema = lector.nextInt();

        int horas = segundosSistema/3600;
        int segundosRestantes = segundosSistema%3600;
        System.out.println("Horas: "+horas);
        System.out.println("Segundos restantes: "+segundosRestantes);
        int minutos = segundosRestantes/60;
        System.out.println("minutos "+minutos);
        int segundos =segundosRestantes%60;
        System.out.println("segundos "+segundos);
        System.out.printf("%d:%d:%d",horas,minutos,segundos);





        lector.close();
    }



}
