package transport;
/*Задание 2
Создайте новый класс «Автобус» (Bus), который полностью наследует все параметры класса Transport.
Создайте любые 3 объекта для данного класса, по каждому выведите в консоль данные.
Критерии проверки
Создан класс Bus.
Класс Bus расширяет класс Transport.
Создано 3 произвольных объекта.
Информация о каждом объекте выведена в консоль.
 */

public class Bus extends Trasport {
    public Bus(String brand,
               String model,
               String color,
               int productionYear,
               String productionCountry,
               int maximumMovementSpeed) {
        super(brand, model, color, productionYear, productionCountry, maximumMovementSpeed);
    }
}
