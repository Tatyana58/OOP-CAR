package transport;
import java.util.Calendar;
import java.util.Objects;
import java.util.regex.Pattern;

/*Задание 2
В классе Car создайте вложенный класс «Ключ» (Key) с параметрами:
«Удаленный запуск двигателя»,
«Бесключевой доступ».
Подсказка
Оба параметра могут быть boolean.

Данные параметры неизменяемые. Добавьте ко всем новым полям проверку данных: параметры не должны быть пустыми, не должны быть равны null и должны содержать корректные данные.
Критерии оценки
Создан вложенный класс Key.
Созданы параметры класса.
Все параметры вложенного класса помечены модификатором доступа private.
Создан конструктор для создания нового объекта класса.
 */
public class Car extends Trasport {
    private double engineVolume;
    private String transmissionCar;
    private final String carBodyType;
    private String registrationNumber;
    private final int numberSeats;
    private boolean rubber; //true - зимние, false - летняя
    private KeyCar keyCar;
    static int year;
    static int month;

    public Car (String brand,String model,double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               int maximumMovementSpeed,
               String transmissionCar,
               String carBodyType,
               String registrationNumber,
               int numberSeats,
               Boolean rubber,
               KeyCar keyCar) {
        super(brand,model,color,productionYear,productionCountry,maximumMovementSpeed);
        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        setEngineVolume(engineVolume);
        setTransmissionCar(transmissionCar);
        this.carBodyType = (carBodyType != null && carBodyType.isEmpty() != true && carBodyType.isBlank() != true) ? carBodyType : "Седан";
        setRegistrationNumber(registrationNumber);
        this.numberSeats = (numberSeats > 0 && numberSeats <= 5) ? numberSeats : 2;
        changeRubberSeason(rubber,month);      //true - зимние, false - летняя
        setKeyCar(keyCar);
    }

    public static String checkingRegistrationNumber(String registrationNumber) {
        if (!Pattern.matches("[а-я][0-9]{3}[а-я]{2}[0-9]{2}[0-9]{2,3}", registrationNumber)) {
            return registrationNumber;
        } else {
            System.out.println("Номер введен не корректно");
            return " Не верный номер ";
        }
    }
    private static boolean changeRubberSeason(boolean rubber,int month) {
        if ((month >= 10 && month <= 11) || (month >= 0 && month <= 3)) {
            rubber = true;
        } else {
            rubber = false;
        }
        return true;
    }

    public static class KeyCar {
        private final boolean remoteEngineStart;
        private final boolean accessKeyless;

        public KeyCar(boolean remoteEngineStart, boolean accessKeyless) {
            this.remoteEngineStart = remoteEngineStart;
            this.accessKeyless = accessKeyless;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isAccessKeyless() {
            return accessKeyless;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            KeyCar keyCar = (KeyCar) o;
            return remoteEngineStart == keyCar.remoteEngineStart && accessKeyless == keyCar.accessKeyless;
        }

        @Override
        public int hashCode() {
            return Objects.hash(remoteEngineStart, accessKeyless);
        }

        @Override
        public String toString() {
            return (remoteEngineStart? ", удаленный запуск двигателя ":", без удаленного запуска двигателя ")+(accessKeyless? ", доступ без ключа доступен " : ", доступ без ключа отключен");
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = (engineVolume <= 0 || engineVolume >= 10) ? 1.5 : engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = (color != null && color.isEmpty() != true && color.isBlank() != true) ? model : "Белый";
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmissionCar() {
        return transmissionCar;
    }

    public void setTransmissionCar(String transmissionCar) {
        this.transmissionCar = (transmissionCar != null && transmissionCar.isEmpty() != true && transmissionCar.isBlank() != true) ? transmissionCar : "МКПП";
    }

    public String getCarBodyType() {
        return carBodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = (registrationNumber != null && registrationNumber.isEmpty() != true && registrationNumber.isBlank() != true) ? checkingRegistrationNumber(registrationNumber) : "Default";
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public boolean isRubber() {
        return rubber;
    }

    public void setRubber(boolean rubber) {
        this.rubber = changeRubberSeason(rubber,month);
    }

    public KeyCar getKeyCar() {
        return keyCar;
    }

    public void setKeyCar(KeyCar keyCar) {
        if (keyCar == null) {
            keyCar = new KeyCar(false, false);
        }else {
            this.keyCar = keyCar;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && productionYear == car.productionYear && numberSeats == car.numberSeats && rubber == car.rubber && brand.equals(car.brand) && model.equals(car.model) && color.equals(car.color) && productionCountry.equals(car.productionCountry) && transmissionCar.equals(car.transmissionCar) && carBodyType.equals(car.carBodyType) && registrationNumber.equals(car.registrationNumber) && keyCar.equals(car.keyCar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, productionYear, productionCountry, transmissionCar, carBodyType, registrationNumber, numberSeats, rubber, keyCar);
    }

    @Override
        public String toString () {
            return "Автомобиль: Марка " + brand + ", модель " + model + ", " + engineVolume + "л., цвет " + color + ", год выпуска " + productionYear + ", страна производитель " + productionCountry + ", максимальная скорость " +maximumMovementSpeed +", коробка передач " + transmissionCar + ", тип кузова " + carBodyType + ", геристрационный номер " + registrationNumber + ", количестко мест " + numberSeats + ", резина " + rubber+keyCar;
        }

}
