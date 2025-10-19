
public class Mainmetodos {

    public void main(String[] args){
        System.out.println("Main para probar metodos y variables");
        String nombre = "Bryan";
        saludar("Bryan");
        saludar("Daniela");
        despedir("Bryan");
        despedir("Daniela");
    }

    public void saludar(String data){
        System.out.println("Enhorabuena "+data+" has llamado a tu primer metodo");
    }

    public void despedir(String data){
    System.out.println("Hemos terminado "+data+", hasta luego");

}

}
