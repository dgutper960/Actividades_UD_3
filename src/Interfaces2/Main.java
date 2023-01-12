package Interfaces2;

public class Main {
    public static void main(String[] args) {
        Imprimible a = new Impresora();
        a.imprime();
        a.establecerContenido("Adios");
        a.imprime();
        Consola b = new Consola();
        b.imprime();
        b.borrar();
    }

}
