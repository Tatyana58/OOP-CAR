/*
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

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Курс 2. Задание 2.");
        Car[] car = new Car[5];
        car[0] = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        car[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        car[2] = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        car[3] = new Car("Kia", "Sportage 4", 2.4, "красный", 2018, "Южная Корея");
        car[4] = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        for (int i = 0; i < car.length ; i++) {
            System.out.println(car[i]);
        }
    }
}