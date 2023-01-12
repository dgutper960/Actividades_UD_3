package Interfaces2;

public class Consola implements Imprimible, Borrable{

    String pantalla = "$";
    private static String pagina = "Esta nueva página";
    private String color = "Verde";


    Consola(){ //Constructor del enunciado 7
        pantalla=Imprimible.TEXTO_POR_DEFECTO;
    }
    public void establecerContenido(String contenido){
        pantalla = pantalla + "" + contenido;
    }
    @Override
    public void imprime() {

        System.out.printf("'%S'" , pantalla);
    }
    public void borrar(){
        color = "blanco";
    }

}
