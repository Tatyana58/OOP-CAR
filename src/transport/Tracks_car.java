package transport;

public class Tracks_car extends Trasport {
    public Tracks_car(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }
    public void startMoving() {
        System.out.println("Начать движение.");
    }

    public void finishMovement() {
        System.out.println("Закончить движение.");
    }

}
