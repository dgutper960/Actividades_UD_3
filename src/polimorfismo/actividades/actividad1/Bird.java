package polimorfismo.actividades.actividad1;

public class Bird extends Animal implements Flyable{

    @Override
    public void speak() {
        System.out.println("Soy el Bird -> Pipipiopiopi");
    }


    @Override
    public void fly() {
        System.out.println("Vooooolannndooo voyyyy");
    }
}
