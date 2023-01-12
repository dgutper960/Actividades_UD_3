package polimorfismo.ejemplos.interfaces;

public class Main {
    public static void main(String[] args) {

        SuperInterface s;

        s = new ImplementacionA();
        s.metodo();

        s = new ImplementacionB();
        s.metodo();
    }
}
