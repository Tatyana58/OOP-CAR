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
public class Bus extends Trasport implements Competing {
    public Bus(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }
    public void startMoving() {
        System.out.println("Начать движение");
    }

    public void finishMovement() {
        System.out.println("Закончить движение");
    }

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

//    @Override
//    public String toString() {
//        return "Bus{" +
//                "brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", engineCapacity=" + engineCapacity +
//                '}';
//    }
}
