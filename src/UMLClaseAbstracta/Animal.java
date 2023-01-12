package UMLClaseAbstracta;

public abstract class Animal {

    Boolean mamifero;

    public abstract int getNumPatas();

    public boolean esMamifero(){
        return true;

    }
    void dormir(){
        System.out.println("zZzZzZz");
    }
    abstract String hablar();
}
