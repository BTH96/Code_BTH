public class Main {
    //Esto es un comentario fuera de codigo
/*
esto es un comentario
en las lineas que necesites
 */
//TODO esto es un todo que sirve para marcar comentarios donde te faltan cosas o donde no has terminado
//esto de debajo es un metodo el metodo main es metodo principal

    public static void main(String[] args)
    {

        //si pones print abajo en vez de println no hay salto de linea
        System.out.println("Este es mi primer comentario y proyecto en java");
        System.out.println("Esta es la segunda linea en java\n");

        String miNombre = "Bryan";
        final String DNI ="X5066964H";
        char letraDNI = 'X';
        int edad = 28;
        edad++;
        double altura = 1.82;
        float peso = 87.700f;
        boolean experiencia = true;


        System.out.println("Mi DNI completo es: " +DNI);
        System.out.println("mi nombre es: "+miNombre);
        System.out.println("La letra de mi DNI es: " +letraDNI);
        System.out.println("Mi edad es: " +edad+ " años");
        System.out.println("Mi altura es: " +altura+ " Metros");
        System.out.println("Mi peso es: " +peso+ " KG");
        System.out.println("Mi experiencia es: " +experiencia);
        //esto es una constantes, valores que ya existen y no se pueden cambiar pues hay valores ya guardados en un lenguaje
        System.out.println("El valor del numero PI es: " +Math.PI);

    //aqui debajo he reasignado el valor de boolean solo no pongo el nombre del metodo y se cambia
        experiencia = false;

    }
    //esto de aqui es otro metodo
    public void nombreMetodo() {
        int edadMetodo =12;
        System.out.println(edadMetodo);
        //Esta variable int solo existe dentro de este metodo, fuera de estas llaves no
    }

}

