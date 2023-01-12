package Interfaces2;

public class Impresora implements Imprimible, Borrable {

    private String pagina;

    @Override
    public void imprime() {
        System.out.println(pagina);

    }

    public void establecerContenido(String contenido){
        pagina = contenido;
    }

    Impresora(){
        pagina = Imprimible.TEXTO_POR_DEFECTO;//Le damos la ruta, pero en este casp no es necesario porque no tenemos ningún campo que se llame igual
    }

    @Override
    public void borrar() {
        pagina=""; //Enunciado 6

    }
}
