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

import java.util.Calendar;
import java.util.Objects;

public class Trasport {
    protected String brand;
    protected String model;
    protected int productionYear;
    protected String productionCountry;
    protected String color;
    protected int maximumMovementSpeed;
    static int year;

    public Trasport(String brand,
                    String model,
                    String color,
                    int productionYear,
                    String productionCountry,
                    int maximumMovementSpeed) {
        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        this.brand = (brand != null && brand.isEmpty() != true && brand.isBlank() != true) ? brand : "Бренд не указан";
        this.model = (model != null && model.isEmpty() != true && model.isBlank() != true) ? model : "Модель не указана";
        this.productionYear = (productionYear <= 0 || productionYear > calendar.get(Calendar.YEAR)) ? 2000 : productionYear;
        this.productionCountry = (productionCountry != null && productionCountry.isEmpty() != true && productionCountry.isBlank() != true) ? productionCountry : "Страна производитель - неизвестна";
        setColor(color);
        setMaximumMovementSpeed(maximumMovementSpeed);
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
        this.color = (color != null && color.isEmpty() != true && color.isBlank() != true) ? model : "Белый";
    }

    public int getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public void setMaximumMovementSpeed(int maximumMovementSpeed) {
        this.maximumMovementSpeed = (maximumMovementSpeed <= 0 || maximumMovementSpeed >= 400) ? 250 : maximumMovementSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trasport trasport = (Trasport) o;
        return productionYear == trasport.productionYear && maximumMovementSpeed == trasport.maximumMovementSpeed && brand.equals(trasport.brand) && model.equals(trasport.model) && productionCountry.equals(trasport.productionCountry) && color.equals(trasport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, productionYear, productionCountry, color, maximumMovementSpeed);
    }
}