package transport;

public class Bus extends Transport<DriverD> {

    private CapacityBus capacityBus;
    private  TypeCar busEnum;
    public Bus(String brand, String model, double engineCapacity, DriverD driverD, CapacityBus capacityBus,TypeCar busEnum) {
        super(brand, model, engineCapacity, driverD);
        this.capacityBus=capacityBus;
        this.busEnum=busEnum;

    }

    public enum TypeCar {
        BUS_ENUM (" Автобус ");
        public String busEnum;
        TypeCar(String busEnum) {
            this.busEnum = busEnum;
        }

        public String getBusEnum() {
            return busEnum;
        }

        public void setBusEnum(String busEnum) {
            this.busEnum = busEnum;
        }

        public void printType() {
            if (getBusEnum() == null) {
                System.out.println(" нет данных !");
            }else {
                System.out.println(getBusEnum());
            }
            //return " тип автомобиля - " + getBusEnum();
        }

    }
    public TypeCar getBusEnum() {
        return busEnum;
    }

    public void setBusEnum(TypeCar busEnum) {
        this.busEnum = busEnum;
    }

    @Override
    boolean passDiagnostics() {
        throw new TransportTypeException("Автобусам диагностику проходить не нужно");
    }

    @Override
    public void pitStop() {
        int minBound = 140; //секунд
        int maxBound = 190;//секунд
        int pitStop = (int) (maxBound + (maxBound - minBound) * Math.random());
        System.out.println("Пит-стоп для Автобуса - " + pitStop);
    }

    @Override
    public void bestLapTime() {
        int minBound = 100;
        int maxBound = 150;
        int bestLapTime = (int) (maxBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга» (для  Автобуса) - " + bestLapTime);
    }

    @Override
    public void maximumSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int) (maxBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость» (для Автобуса) - " + maxSpeed);
    }

    @Override
    public void printType() {
        if (getBusEnum() == null) {
            System.out.println(" нет данных !");
        }else {
            System.out.println(getBusEnum());
        }
    }

    @Override
    public void startMoving() {
        System.out.println("\nНачал движение Автобус марки: - " + getBrand() + ", модель: " + getModel() + ", объем двигателя: " + getEngineCapacity());
    }

    @Override
    public void finishMovement() {
        System.out.print("Закончил движение Автобус марки: - " + getBrand() + ", модель: " + getModel() + ", объем двигателя: " + getEngineCapacity());
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

    @Override
    public String toString() {
        startMoving();
        pitStop();
        bestLapTime();
        maximumSpeed();
        finishMovement();
        return "";
    }
}
