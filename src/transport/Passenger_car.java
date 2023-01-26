package transport;

public class Passenger_car extends Trasport implements Competing{
    public Passenger_car(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }
    public void startMoving() {
        System.out.println("Начать движение.");
    }

    public void finishMovement() {
        System.out.println("Закончить движение.");
    }


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

//    @Override
//    public String toString() {
//        return "Passenger_car{" +
//                "brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", engineCapacity=" + engineCapacity +
//                '}';
//    }
}
