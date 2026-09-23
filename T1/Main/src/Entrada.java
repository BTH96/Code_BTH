import java.sql.SQLOutput;

public class Entrada {

    public static void main (String[] args) {

        String nombre = "Bryan";
        nombre = "Bryancito";
        String apellido1 = "Trejos";
        String apellido2 ="Henao";
        final String DNI = "12345A";
// En una variable si le tienes que poner dos nombres la primera en minuscula y la segunda en mayuscula, en plan, nombreLegal por ejemplo

    char letra = 'A';
    int edad = 30;
    edad++;
    double altura = 1.74;
    float alturaFloat = 1.74f;
    boolean acierto = false;
    Character letraCompleja = 'B';
    // Si pongo por ejemplo como en el Character letraCompleja y un punto, salen muchisimas funcionalidades que con un char no sale porque es primitiva

    Object cosa = "Esta variable sirve como cualquier variable";



        System.out.println("Hola mundo");
        System.out.println("Esta es la segunda linea");
                System.out.print("esta linea va junto con la siguiente por no ponerle el nl al print");
                System.out.print("al darle a que imprima por consola lo veras");
        System.out.println(90+" hola de nuevo");
        System.out.printf("Me llamo %s con apellidos %s %s y tengo %d años",nombre,apellido1,apellido2,edad);
        System.out.println(letra);
        System.out.println(DNI);
    }





}
