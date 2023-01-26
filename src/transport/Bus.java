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
public class Bus<DriverD> extends Trasport implements Competing {
    public Bus(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }
    public void startMoving() {
        System.out.println("\nНачать движение для Автобуса");
    }
//    public void print(Competing[] competings) {
//
//        startMoving();
//        System.out.print(" - Марка авто "+getBrand()+", модель "+getModel()+", объем двигателя "+getEngineCapacity());
//        pitStop();
//        finishMovement();
//    }
    public void finishMovement() {
        System.out.print("Закончить движение для Автобуса.");
    }
    public void pitStop(){
        System.out.println("Пит-стоп для Автобуса");
    };
    static void bestLapTime(){
        System.out.println("Лучшее время круга» (для  Автобуса");
    };
    static void maximumSpeed(){
        System.out.println("Максимальная скорость» (для Автобуса).");
    };

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public double getEngineCapacity() {
        return super.getEngineCapacity();
    }

    @Override
    public void setEngineCapacity(double engineCapacity) {
        super.setEngineCapacity(engineCapacity);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        startMoving();
        pitStop();
        bestLapTime();
        maximumSpeed();
        finishMovement();
        return " -  Марка авто "+getBrand()+", модель "+getModel()+", объем двигателя "+getEngineCapacity();
    }
}
