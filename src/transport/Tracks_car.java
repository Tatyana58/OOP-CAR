package transport;

public class Tracks_car extends Trasport implements Competing{
    public Tracks_car(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }
    public void startMoving() {
        System.out.println("\nНачать движение. Грузового транспорта. ");
    }

    public void finishMovement() {
        System.out.print("Закончить движение. Грузового транспорта.");
    }


    static void pitStop(){
        System.out.println("Пит-стоп для Грузового транспорта");
    };

    static void bestLapTime(){
        System.out.println("Лучшее время круга» (для Грузового транспорта)");
    };
    static void maximumSpeed(){
        System.out.println("Максимальная скорость» (для Грузового транспорта).");
    };

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public double getEngineCapacity() {
        return super.getEngineCapacity();
    }

    @Override
    public void setEngineCapacity(double engineCapacity) {
        super.setEngineCapacity(engineCapacity);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        startMoving();
        pitStop();
        bestLapTime();
        maximumSpeed();
        finishMovement();
        return " - Марка авто "+getBrand()+", модель "+getModel()+", объем двигателя "+getEngineCapacity();
    }
}
