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

Задание 2
Перепишите класс «Автомобиль» с использованием конструктора. Передайте все свойства созданных вами объектов машин с помощью конструктора.

Выведите в консоль сообщение о каждом автомобиле с перечислением всех их характеристик.

Критерии оценки
В поле объекта использован конструктор.
Свойства объектов передаются с помощью конструктора.
В консоль выведено сообщение о каждом автомобиле с перечислением всех их характеристик.
 */
public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && year == car.year && brand.equals(car.brand) && model.equals(car.model) && color.equals(car.color) && country.equals(car.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, year, country);
    }

    @Override
    public String toString(){
        return "Автомобиль: Марка " + brand + ", модель " + model + ", "+ engineVolume + "л., цвет " + color + ", год выпуска " + year + ", страна производитель " + country;
    }
}
