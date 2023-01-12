package UMLClaseAbstracta;

public class Gato extends Animal {
    @Override
    public int getNumPatas() {
        return 4;
    }

    @Override
    String hablar() {
        return "Miau";
    }
}
