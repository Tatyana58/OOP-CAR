package transport;

public class Passenger_car extends Trasport<DriverB> {
    private String bodyType;

    public Passenger_car(String brand, String model, double engineCapacity, DriverB driverB, String bodyType) {
        super(brand, model, engineCapacity, driverB);
        this.setBodyType(bodyType);

    }

    public String toString() {
        return getBrand() + ", " + getModel() + ", " + getEngineCapacity() + ", Тип Кузова - " + getBodyType() + getDriver().toString();
    }

    @Override
    public void pitStop() {
        int minBound = 60; //секунд
        int maxBound = 120;//секунд
        int pitStop = (int) (maxBound+(maxBound-minBound)*Math.random());
        System.out.println("Пит-стоп для Легкового транспорта - " + pitStop);
    }

    @Override
    public void bestLapTime() {
        int minBound = 140;
        int maxBound = 200;
        int bestLapTime = (int) (maxBound+(maxBound-minBound)*Math.random());
        System.out.println("Лучшее время круга» (для Легкового транспорта - " + bestLapTime);
    }

    @Override
    public void maximumSpeed() {
        int minBound = 100;
        int maxBound = 140;
        int maxSpeed = (int) (maxBound+(maxBound-minBound)*Math.random());
        System.out.println("Максимальная скорость» (для Легкового транспорта) - " + maxSpeed);
    }

    @Override
    public void startMoving() {
        System.out.println("\nНачал движение Легковой транспорт - " + getBrand() + ", модель: "+getModel()+ ", объем двигателя: " + getEngineCapacity());
    }

    @Override
    public void finishMovement() {
        System.out.print("Закончил движение Легковой транспорт " + getBrand() + ", модель: "+getModel()+ ", объем двигателя: " + getEngineCapacity());
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

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

}
