package transport;
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
public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;

    private String transmissionCar;
    private final String carBodyType;
    private String registrationNumber;
    private final int numberSeats;
    private boolean rubber;
    private KeyCar keyCar;

    public Car(String brand, String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String transmissionCar,
               String carBodyType,
               String registrationNumber,
               int numberSeats,
               Boolean rubber,
               KeyCar keyCar) {
        this.brand = (brand != null && brand.isEmpty() != true && brand.isBlank() != true) ? brand : "Default";
        this.model = (model != null && model.isEmpty() != true && model.isBlank() != true) ? model : "Default";
        this.engineVolume = (engineVolume <= 0) ? engineVolume : 1.5;
        this.color = (color != null && color.isEmpty() != true && color.isBlank() != true) ? model : "Белый";
        this.productionYear = (productionYear <= 0) ? productionYear : 2000;
        this.productionCountry = (productionCountry != null && productionCountry.isEmpty() != true && productionCountry.isBlank() != true) ? productionCountry : "Default";
        this.transmissionCar = (transmissionCar != null && transmissionCar.isEmpty() != true && transmissionCar.isBlank() != true) ? transmissionCar : "Автомат";
        this.carBodyType = (carBodyType != null && carBodyType.isEmpty() != true && carBodyType.isBlank() != true) ? carBodyType : "Седан";
        this.registrationNumber = (registrationNumber != null && registrationNumber.isEmpty() != true && registrationNumber.isBlank() != true) ? checkingRegistrationNumber(registrationNumber) : "Default";
        this.numberSeats = (numberSeats > 0 && numberSeats <= 5) ? numberSeats : 2;
        this.rubber = (rubber != null) ? rubber : true;
        this.keyCar = (keyCar != null) ? keyCar : null;
    }

    public static String checkingRegistrationNumber(String registrationNumber) {
        if (!Pattern.matches("[а-я][0-9]{3}[а-я]{2}[0-9]{2}[0-9]{2,3}", registrationNumber)) {
            return registrationNumber;
        } else {
            System.out.println("Номер введен не корректно");
            return " Не верный номер ";
        }
    }

    public static class KeyCar {
        private final boolean remoteEngineStart;
        private final boolean accessKeyless;

        public KeyCar(boolean remoteEngineStart, boolean accessKeyless) {
            this.remoteEngineStart = remoteEngineStart;
            this.accessKeyless = accessKeyless;
        }

        @Override
        public String toString() {
            return ", удаленный запуск двигателя " + remoteEngineStart +
                    ", бесключевой доступ " + accessKeyless;
        }
    }

    public KeyCar getKeyCar() {
        return keyCar;
    }

    public void setKeyCar(KeyCar keyCar) {
        this.keyCar = keyCar;
    }

    public String getBrand () {
            return brand;
        }

        public String getModel () {
            return model;
        }

        public double getEngineVolume () {
            return engineVolume;
        }

        public String getColor () {
            return color;
        }

        public int getProductionYear () {
            return productionYear;
        }

        public String getProductionCountry () {
            return productionCountry;
        }

        public String getTransmissionCar () {
            return transmissionCar;
        }

        public String getCarBodyType () {
            return carBodyType;
        }

        public String getRegistrationNumber () {
            return registrationNumber;
        }

        public int getNumberSeats () {
            return numberSeats;
        }

        public boolean isRubber () {
            return rubber;
        }

        public void setEngineVolume ( double engineVolume){
            this.engineVolume = engineVolume;
        }

        public void setColor (String color){
            this.color = color;
        }

        public void setTransmissionCar (String transmissionCar){
            this.transmissionCar = transmissionCar;
        }

        public void setRegistrationNumber (String registrationNumber){
            this.registrationNumber = registrationNumber;
        }

        public void setRubber ( boolean rubber){
            this.rubber = rubber;
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
            return "Автомобиль: Марка " + brand + ", модель " + model + ", " + engineVolume + "л., цвет " + color + ", год выпуска " + productionYear + ", страна производитель " + productionCountry + ", коробка передач " + transmissionCar + ", тип кузова " + carBodyType + ", геристрационный номер " + registrationNumber + ", количестко мест " + numberSeats + ", резина " + rubber+keyCar;
        }

}
