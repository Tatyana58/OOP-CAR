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

public class trasport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int maximumMovementSpeed;

    public trasport(String brand, String model, int productionYear, String productionCountry, String color, int maximumMovementSpeed) {
        this.brand = (brand != null && brand.isEmpty() != true && brand.isBlank() != true) ? brand : "Default";
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        this.maximumMovementSpeed = maximumMovementSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public void setMaximumMovementSpeed(int maximumMovementSpeed) {
        this.maximumMovementSpeed = maximumMovementSpeed;
    }
}
