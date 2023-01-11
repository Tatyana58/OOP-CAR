/*
Задание 1
Создайте класс «Автомобиль», у которого есть:
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
Напишите программу, которая будет выводить в консоль информацию о каждом автомобиле и все указанные выше характеристики.
Подсказка
Для вывода объекта в консоль можно определить у него метод toString().
Критерии оценки
Создан класс car со свойствами brand, model, engineVolume, color, productionYear, productionCountry.
Создан объект Lada Granta со свойствами класса car.
Создан объекта Audi A8 со свойствами класса car.
Создан объект BMW Z8 со свойствами класса car.
Создан объект Kia Sportage 4-го поколения со свойствами класса car.
Создан объект Hyundai Avante со свойствами класса car.
В консоль выводится информация о каждом автомобиле и все указанные характеристики.
Переменные инициализированы согласно правилам camelCase.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Курс 2. Задание 1.");

        //Lada Granta, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя — 1,7 л.
        Car ladaGranta = new Car();
        ladaGranta.brand = "Lada";
        ladaGranta.model = "Granta";
        ladaGranta.engineVolume = 1.7;
        ladaGranta.color = "Желтый";
        ladaGranta.productionYear = 2015;
        ladaGranta.productionСountry = "Россия";

        System.out.println(ladaGranta);

        //Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя — 3,0 л.
        Car Audi = new Car();
        Audi.brand = "Audi";
        Audi.model = "A8 50 L TDI quattro";
        Audi.engineVolume = 3.0;
        Audi.color = "Черный";
        Audi.productionYear = 2020;
        Audi.productionСountry = "Германия";

        System.out.println(Audi);

        //BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем — 3,0 л.
        Car BMW = new Car();
        BMW.brand = "BMW";
        BMW.model = "Z8";
        BMW.engineVolume = 3.0;
        BMW.color = "Черный";
        BMW.productionYear = 2021;
        BMW.productionСountry = "Германия";

        System.out.println(BMW);

        //Kia Sportage 4-го поколения, 2018 год выпуска, сборка в Южной Корее, цвет кузова — красный, объем двигателя — 2,4 л.
        Car Kia = new Car();
        Kia.brand = "Kia";
        Kia.model = "Sportage 4";
        Kia.engineVolume = 2.4;
        Kia.color = "Красный";
        Kia.productionYear = 2018;
        Kia.productionСountry = "Южная Корея";

        System.out.println(Kia);

        //Hyundai Avante, сборка в Южной Корее, цвет кузова — оранжевый, объем двигателя — 1,6 л, год выпуска — 2016 год.
        Car Hyundai = new Car();
        Hyundai.brand = "Hyundai";
        Hyundai.model = "Avante";
        Hyundai.engineVolume = 1.6;
        Hyundai.color = "Оранжевый";
        Hyundai.productionYear = 2016;
        Hyundai.productionСountry = "Южная Корея";

        System.out.println(Hyundai);
    }
}