package transport;

import java.util.Objects;

/*Задание 1
Создайте пакет transport  и перенесите туда класс Car.
В классе Car уже созданы следующие свойства:
«Марка»,
«Модель»,
«Объем двигателя» в литрах,
«Цвет кузова»,
«Год производства»,
«Страна сборки».
Нужно добавить классу Car  следующие свойства:

«Коробка передач»,
«Тип кузова»,
«Регистрационный номер»,
«Количество мест»,
признак «Летняя» или «Зимняя резина».
Подсказка
Признак зимней или летней резины можно смоделировать с помощью типа boolean.

При этом следующие поля изменяться не могут:
«Марка»,
«Модель»,
«Год производства»,
«Страна сборки»,
«Тип кузова»,
«Количество мест».
Подсказка
Поля не могут изменяться, а значит имеют модификатор final.

Соответственно, для этих полей нужно настроить модификатор доступа и создать геттеры.
Остальные поля изменяться могут — доступ к ним должен осуществляться через геттеры и сеттеры. Не забудьте добавить модификаторы доступа для каждого параметра класса, а также для конструкторов.
Пропишите проверку данных для новых полей класса, а также значения по умолчанию, если параметры пустые, равны null или имеют некорректное значение.
Добавьте функциональность: метод «сменить шины на сезонные».
Подсказка
Метод может принимать текущий месяц целым числом и в зависимости от месяца устанавливать признак “Зимняя или летняя резина” в true и false соответственно.

Критерии оценки
Настроены модификаторы доступа у всех параметров класса.
Созданы геттеры для неизменяющихся параметров.
Созданы геттеры и сеттеры для изменяющихся параметров.
Созданы конструкторы с модификатором доступа.
Для каждого параметра класса настроена проверка данных и указаны значения по умолчанию.
Данные по каждому объекту дополнены новыми параметрами класса.
Создан метод «сменить шины на сезонные».
Полный список параметров каждого объекта выведен в консоль.
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


    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry,String transmissionCar,String carBodyType,String registrationNumber,int numberSeats,Boolean rubber) {
        this.brand = (brand != null && brand.isEmpty() != true && brand.isBlank() != true) ? brand : "Default";
        this.model = (brand != null && model.isEmpty() != true && model.isBlank() != true) ? model : "Default";
        this.engineVolume = (engineVolume <= 0) ? engineVolume : 1.5;
        this.color = (color != null && color.isEmpty() != true && color.isBlank() != true) ? model : "Белый";
        this.productionYear = (productionYear <= 0) ? productionYear : 2000;
        this.productionCountry = (productionCountry != null && productionCountry.isEmpty() != true && productionCountry.isBlank() != true) ? productionCountry : "Default";
        this.transmissionCar = transmissionCar;
        this.carBodyType = carBodyType;
        this.registrationNumber = registrationNumber;
        this.numberSeats = numberSeats;
        this.rubber = rubber;
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

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && productionYear == car.productionYear && numberSeats == car.numberSeats && rubber == car.rubber && brand.equals(car.brand) && model.equals(car.model) && color.equals(car.color) && productionCountry.equals(car.productionCountry) && transmissionCar.equals(car.transmissionCar) && carBodyType.equals(car.carBodyType) && registrationNumber.equals(car.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, productionYear, productionCountry, transmissionCar, carBodyType, registrationNumber, numberSeats, rubber);
    }

    @Override
    public String toString(){
        return "Автомобиль: Марка " + brand + ", модель " + model + ", "+ engineVolume + "л., цвет " + color + ", год выпуска " + productionYear + ", страна производитель " + productionCountry+", коробка передач "+transmissionCar+", тип кузова "+carBodyType+", геристрационный номер "+registrationNumber+", количестко мест "+numberSeats+", резина зимняя "+rubber;
    }
}
