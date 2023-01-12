package polimorfismo.actividades.actividad1;

public class Main {
    public static void main(String[] args) {

        Instrumento a;

        a = new Guitarra();
        a.tocar();

        a = new Tambor();
        a.tocar();
    }
}
