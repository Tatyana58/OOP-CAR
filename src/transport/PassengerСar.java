package transport;

import java.util.List;

public class PassengerСar extends Transport<DriverB> {
    private String bodyType;
    private TypeCar typeCar;

    public PassengerСar(String brand, String model, double engineCapacity, DriverB driverB, String bodyType,TypeCar typeCar,List<Mechanic> mechanic) {
        super(brand, model, engineCapacity, driverB, mechanic);
        this.bodyType = bodyType;
        this.typeCar=typeCar;
    }


    public enum TypeCar {
        PASSENGER(" Легковой автомобиль ");

        public String pasNum;

        TypeCar(String pasNum) {
            this.pasNum=pasNum;
        }

        public String getPasNum() {
            return pasNum;
        }

        public void setPasNum(String pasNum) {
            this.pasNum = pasNum;
        }

        public String printType() {
            return " тип автомобиля - " + getPasNum();
        }

//        @Override
//        public String toString() {
//            return ", тип авто  - " + getPasNum();
//        }
    }

    public TypeCar getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(TypeCar typeCar) {
        this.typeCar = typeCar;
    }

    @Override
    public String repair() {
        return "Ремонтируем у легкового автомобиля сигнализацию";
    }

    @Override
    boolean passDiagnostics() {
        System.out.println("Легковой автомобиль "+ getBrand() +", "+getModel()+" прошел диагностику");
        return true;
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
    public String toString() {
        return getBrand() + ", " + getModel() + ", " + getEngineCapacity() + ", Тип Кузова - " + getBodyType() + getDriver().toString()+", "+getMechanic().toString();
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
