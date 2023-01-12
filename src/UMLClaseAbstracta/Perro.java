package UMLClaseAbstracta;

public class Perro extends Animal{


    @Override
    public int getNumPatas() {
        return 4;
    }

    @Override
    String hablar() {
        return "Guau!";
    }
}
