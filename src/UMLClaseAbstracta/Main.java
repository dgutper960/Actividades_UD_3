package UMLClaseAbstracta;

public class Main {
        public static void main(String[] args) {
            Animal perro1=new Perro();
            Animal gato1=new Gato();


            System.out.println("Soy un perro y tengo: " + perro1.getNumPatas() + "patas");
            System.out.println("Soy mamifero? " + perro1.esMamifero());
        }
    }

