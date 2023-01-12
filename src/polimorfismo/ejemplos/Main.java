package polimorfismo.ejemplos;

public class Main {
    public static void main(String[] args) {

    Superclase s;

    s = new SubclaseA();
    s.metodo();

    s = new SubclaseB();
    s.metodo();

    s = new Superclase();
    s.metodo();

    }

}
