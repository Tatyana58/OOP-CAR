package transport;

/*Задание 1
Создайте класс Transport , который содержит в себе следующие параметры:
«Марка»,
«Модель»,
«Год выпуска»,
«Страна производства»,
«Цвет кузова»,
«Максимальная скорость передвижения».
Создайте геттеры и сеттеры для необходимых полей. Параметры «Год выпуска», «Страна производства» не могут изменяться.
Параметры «Цвет» и «Скорость» изменяться могут.
Для изменяемых параметров добавьте проверку данных: значение должно быть указано корректно, не должно содержать null и не может быть пустым.

Скорректируйте класс Car таким образом, чтобы ранее указанные параметры не повторяли те, которые содержатся в классе Transport.
Класс Car  должен наследовать параметры класса Transport.
Критерии проверки
Создан класс Transport с параметрами.
Класс Car должен быть наследником класса Transport.
Для класса Car настроено расширение.
Параметры класса Car скорректированы, убраны повторы параметров из класса Transport.
Данные по ранее созданным объектам выведены в консоль.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport <T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineCapacity;
    private T driver;
    private List<Mechanic> mechanic;

    public Transport(String brand,
                    String model,
                    double engineCapacity,
                    T driver,
                     List<Mechanic> mechanic){

        this.brand = (brand != null && brand.isEmpty() != true && brand.isBlank() != true) ? brand : "Бренд не указан";
        this.model = (model != null && model.isEmpty() != true && model.isBlank() != true) ? model : "Модель не указана";
        setEngineCapacity(engineCapacity);
        setDriver(driver);
        this.mechanic = new ArrayList<>(mechanic);
        //this.bodyType = bodyType;
//        this.productionYear = (productionYear <= 0 || productionYear > calendar.get(Calendar.YEAR)) ? 2000 : productionYear;
//        this.productionCountry = (productionCountry != null && productionCountry.isEmpty() != true && productionCountry.isBlank() != true) ? productionCountry : " Неизвестна";
//        setColor(color);
//        setMaximumMovementSpeed(maximumMovementSpeed);
    }

    public enum TypeCar{
        PASSENGER(" Легковой автомобиль "),
        TRACK(" Грузовой атомобиль"),
        BUS_ENUM (" Автобус ");
        public String typeCarEnum;

        TypeCar(String typeCarEnum) {
            this.typeCarEnum = typeCarEnum;
        }
    }


    abstract boolean passDiagnostics()throws TransportTypeException;

    public abstract void printType();

    public abstract void startMoving();

    public abstract void finishMovement();
    public T getDriver() {
        return driver;
    }

    public abstract String repair();


    public List<Mechanic> getMechanic() {
        return mechanic;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = (engineCapacity <= 0 || engineCapacity > 5.0) ? 2.4 : engineCapacity;
    }

    @Override
    public void pitStop() {
    }

    @Override
    public void bestLapTime() {
    }

    @Override
    public void maximumSpeed() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport trasport = (Transport) o;
        return Double.compare(trasport.engineCapacity, engineCapacity) == 0 && brand.equals(trasport.brand) && model.equals(trasport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineCapacity);
    }

    @Override
    public String toString() {
        return "Автомобиль - " + brand + '\'' +
                ", модель " + model + '\'' +
                ", мощность двигателя " + engineCapacity +
                ", водитель " + driver;
    }




    //    public int getProductionYear() {
//        return productionYear;
//    }
//
//    public String getProductionCountry() {
//        return productionCountry;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = (color != null && color.isEmpty() != true && color.isBlank() != true) ? color : "Белый";
//    }
//
//    public int getMaximumMovementSpeed() {
//        return maximumMovementSpeed;
//    }
//
//    public void setMaximumMovementSpeed(int maximumMovementSpeed) {
//        this.maximumMovementSpeed = (maximumMovementSpeed <= 0 || maximumMovementSpeed >= 250) ? 100 : maximumMovementSpeed;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Trasport trasport = (Trasport) o;
//        return productionYear == trasport.productionYear && maximumMovementSpeed == trasport.maximumMovementSpeed && brand.equals(trasport.brand) && model.equals(trasport.model) && productionCountry.equals(trasport.productionCountry) && color.equals(trasport.color);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(brand, model, productionYear, productionCountry, color, maximumMovementSpeed);
//    }
//
//    @Override
//    public String toString() {
//        return "Автобус : Марка " + brand + ", модель " + model + ", цвет " + color + ", год выпуска " + productionYear +
//                ", страна производитель " + productionCountry + ", максимальная скорость " +maximumMovementSpeed;
//    }
}
