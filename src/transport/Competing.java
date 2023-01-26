package transport;

public interface Competing {
    static void pitStop(){
        System.out.println("Пит-стоп");
    };

    static void bestLapTime(){
        System.out.println("Лучшее время круга» (для каждого участника гонок");
    };
    static void maximumSpeed(){
        System.out.println("Максимальная скорость» (для каждого участника гонок).");
    };

}
