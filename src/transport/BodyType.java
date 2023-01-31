package transport;

public enum BodyType {
    TYPE1("Седан"),
    TYPE2("Хетчбэк"),
    TYPE3("Купе"),
    TYPE4("Универсал"),
    TYPE5("Внедорожник"),
    TYPE6("Кроссовер"),
    TYPE7("Пикап"),
    TYPE8("Фургон"),
    TYPE9("Минивэн");
    private  String nameCar;
    BodyType(String nameCar) {
        this.nameCar=nameCar;
    }

    public String getNameCar() {
        return nameCar;
    }

    @Override
    public String toString() {
        return ":" + getNameCar();
    }
}
