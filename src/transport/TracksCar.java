package transport;

public class TracksCar extends Trasport<DriverC>{

    private LoadCapacity loadCapacity;
    private TypeCar typeCar;
    public TracksCar(String brand, String model, double engineCapacity, DriverC driverC, LoadCapacity loadCapacity, TypeCar typeCar){
        super(brand,
                model,
                engineCapacity,
                driverC);
        this.loadCapacity = loadCapacity;
        this.typeCar = typeCar;
    }
//    @Override
//   public String toString() {
//        return getBrand()+getModel()+getEngineCapacity()+getDriver().toString()+super.toString();   }

    public enum TypeCar {
        TRACK(" Грузовой атомобиль"),
        NULL ("");
        public String trackEnum;

        TypeCar(String trackEnum) {
            this.trackEnum = trackEnum;
        }

        public String getTrackEnum() {
            return trackEnum;
        }

        public void setTrackEnum(String trackEnum) {
            this.trackEnum = trackEnum;
        }
        public void printType() {
            if (getTrackEnum() == null) {
                System.out.println(" нет данных !");
            } else {
                System.out.println(getTrackEnum());
            }
        }
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public TypeCar getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(TypeCar typeCar) {
        this.typeCar = typeCar;
    }

    @Override
    public void printType() {
        if (getTypeCar() == null) {
            System.out.println(" нет данных !");
        }else {
            System.out.println(getTypeCar());
        }
    }

    @Override
    public void pitStop() {
        int minBound = 180; //секунд
        int maxBound = 360;//секунд
        int pitStop = (int) (maxBound+(maxBound-minBound)*Math.random());
        System.out.println("Пит-стоп для Грузового транспорта - " + pitStop);
    }

    @Override
    public void bestLapTime() {
        int minBound = 140;
        int maxBound = 200;
        int bestLapTime = (int) (maxBound+(maxBound-minBound)*Math.random());
        System.out.println("Лучшее время круга» (для Грузового транспорта) - " + bestLapTime);
    }

    @Override
    public void maximumSpeed() {
        int minBound = 100;
        int maxBound = 140;
        int maxSpeed = (int) (maxBound+(maxBound-minBound)*Math.random());
        System.out.println("Максимальная скорость» (для Грузового транспорта) - " + getBrand());
    }

    @Override
    public void startMoving() {
        System.out.println("\nНачал движение Грузовой транспорт  - " + getBrand() + ", модель: "+getModel()+ ", объем двигателя: " + getEngineCapacity());
    }

    @Override
    public void finishMovement() {
        System.out.print("Закончил движение Грузовой транспорт - " + getBrand() + ", модель: "+getModel()+ ", объем двигателя: " + getEngineCapacity());
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
//        startMoving();
//        pitStop();
//        bestLapTime();
//        maximumSpeed();
//        finishMovement();
//        return ""+ getBrand()+getModel()+getEngineCapacity()+getDriver().toString()+super.toString();
//    }

    public String toString() {
        return ""+ getBrand()+getModel()+getEngineCapacity()+getDriver().toString()+getLoadCapacity();
    }

}
