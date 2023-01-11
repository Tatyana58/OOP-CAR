/*Создайте класс «Автомобиль», у которого есть:
марка (brand),
модель (model),
объем двигателя в литрах (engineVolume),
цвет кузова (color),
год производства (year),
страна сборки (country).
Подсказка
Для вывода объекта в консоль можно определить у него метод toString().
 */
public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionСountry;

    @Override
    public String toString(){
        return "Автомобиль: Марка " + brand + ", модель " + model + ", "+ engineVolume + "л., цвет " + color + ", год выпуска " + productionYear + ", страна производитель " + productionСountry;
    }
}
