package transport;
import java.util.Objects;

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

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, String transmissionCar, String carBodyType, String registrationNumber, int numberSeats, Boolean rubber) {
        this.brand = (brand != null && brand.isEmpty() != true && brand.isBlank() != true) ? brand : "Default";
        this.model = (brand != null && model.isEmpty() != true && model.isBlank() != true) ? model : "Default";
        this.engineVolume = (engineVolume <= 0) ? engineVolume : 1.5;
        this.color = (color != null && color.isEmpty() != true && color.isBlank() != true) ? model : "Белый";
        this.productionYear = (productionYear <= 0) ? productionYear : 2000;
        this.productionCountry = (productionCountry != null && productionCountry.isEmpty() != true && productionCountry.isBlank() != true) ? productionCountry : "Default";
        this.transmissionCar = (transmissionCar != null && transmissionCar.isEmpty() != true && transmissionCar.isBlank() != true) ? transmissionCar : "Default";
        this.carBodyType = (carBodyType != null && carBodyType.isEmpty() != true && carBodyType.isBlank() != true) ? carBodyType : "Default";
        this.registrationNumber = (registrationNumber != null && registrationNumber.isEmpty() != true && registrationNumber.isBlank() != true) ? registrationNumber : "Default";
        this.numberSeats = (numberSeats > 0 && numberSeats <= 5) ? numberSeats : 2;
        this.rubber = (rubber==true)? rubber:false;
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
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Car car = (Car) o;
            return Double.compare(car.engineVolume, engineVolume) == 0 && productionYear == car.productionYear && numberSeats == car.numberSeats && rubber == car.rubber && brand.equals(car.brand) && model.equals(car.model) && color.equals(car.color) && productionCountry.equals(car.productionCountry) && transmissionCar.equals(car.transmissionCar) && carBodyType.equals(car.carBodyType) && registrationNumber.equals(car.registrationNumber);
        }

        @Override
        public int hashCode () {
            return Objects.hash(brand, model, engineVolume, color, productionYear, productionCountry, transmissionCar, carBodyType, registrationNumber, numberSeats, rubber);
        }

        @Override
        public String toString () {
            return "Автомобиль: Марка " + brand + ", модель " + model + ", " + engineVolume + "л., цвет " + color + ", год выпуска " + productionYear + ", страна производитель " + productionCountry + ", коробка передач " + transmissionCar + ", тип кузова " + carBodyType + ", геристрационный номер " + registrationNumber + ", количестко мест " + numberSeats + ", резина " + rubber;
        }
    }
