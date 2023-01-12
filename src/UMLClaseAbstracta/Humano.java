package UMLClaseAbstracta;

public class Humano extends Animal {
    @Override
    public int getNumPatas() {
        return 2;
    }

    @Override
    String hablar() {
        return "Hola Chavales...¿Qué pasa";
    }
}


