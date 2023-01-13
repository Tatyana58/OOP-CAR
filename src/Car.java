import java.util.Objects;

/*Создайте класс «Автомобиль», у которого есть:

марка (brand),
модель (model),
объем двигателя в литрах (engineVolume),
цвет кузова (color),
год производства (year),
страна сборки (country).
Создайте объекты для следующих автомобилей:

Lada Granta, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя — 1,7 л.
Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя — 3,0 л.
BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем — 3,0 л.
Kia Sportage 4-го поколения, 2018 год выпуска, сборка в Южной Корее, цвет кузова — красный, объем двигателя — 2,4 л.
Hyundai Avante, сборка в Южной Корее, цвет кузова — оранжевый, объем двигателя — 1,6 л, год выпуска — 2016 год.

Задание 3
Продолжим работать с классом Car.
Дополните созданные ранее конструкторы проверками:
Если передана пустая строка или null в поля модель, марка машины и страна сборки, то значение по умолчанию — default.
Если переданный объем двигателя ≤=0, то значение по умолчанию — 1,5 л.
Если передана пустая строка или null, то цвет кузова по умолчанию — белый.
Если год производства ≤0, то значение по умолчанию — 2000.
В случае если какая-либо информация не указана по объекту, программа должна выводить в консоль информацию о каждом автомобиле и все указанные выше характеристики, подставляя вместо отсутствующей информации значение по умолчанию.
Критерии оценки
В поле объекта использован конструктор.
В классе в поле конструктора добавлены проверки с помощью условных операторов данных, введенных в объектах.
Свойства объектов передаются с помощью конструктора.
Если передана пустая строка или null в поля, в консоль выводится значение по умолчанию.
В консоль выводится информация о каждом автомобиле и все указанные характеристики. Если значений не хватает, то подставляется значение по умолчанию.
Переменные инициализированы согласно правилам camelCase.
 */
public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = (brand != null && brand.isEmpty() != true && brand.isBlank() != true) ? brand : "Default";
        this.model = (brand != null && model.isEmpty() != true && model.isBlank() != true) ? model : "Default";
        this.engineVolume = (engineVolume <= 0) ? engineVolume : 1.5;
        this.color = (color != null && color.isEmpty() != true && color.isBlank() != true) ? model : "Белый";
        this.productionYear = (productionYear <= 0) ? productionYear : 2000;
        this.productionCountry = (productionCountry != null && productionCountry.isEmpty() != true && productionCountry.isBlank() != true) ? productionCountry : "Default";
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
        return Double.compare(car.engineVolume, engineVolume) == 0 && productionYear == car.productionYear && brand.equals(car.brand) && model.equals(car.model) && color.equals(car.color) && productionCountry.equals(car.productionCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, productionYear, productionCountry);
    }

    @Override
    public String toString(){
        return "Автомобиль: Марка " + brand + ", модель " + model + ", "+ engineVolume + "л., цвет " + color + ", год выпуска " + productionYear + ", страна производитель " + productionCountry;
    }
}
