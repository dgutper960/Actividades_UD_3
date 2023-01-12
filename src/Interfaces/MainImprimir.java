package Interfaces;

public class MainImprimir {
    public static void main(String[] args) {
       Imprimible primer=new Impresora();
        System.out.println(Imprimible.pagina);
       primer.imprime();
            }
    }

