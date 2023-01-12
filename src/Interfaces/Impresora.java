package Interfaces;

public class Impresora implements Imprimible{
        String pagina = "400";

        public Impresora(String pagina) {
                this.pagina = pagina;
        }

        public Impresora() {
                pagina=Imprimible.pagina;
        }

        @Override
        public void imprime() {
        System.out.println(pagina);


        }
    }

