package transport;
/*
Задание 2
В классе Car  создайте вложенный класс «Ключ» (Key) с параметрами:
«Удаленный запуск двигателя»,
«Бесключевой доступ».
Подсказка
Оба параметра могут быть boolean.

Данные параметры неизменяемые. Добавьте ко всем новым полям проверку данных: параметры не должны быть пустыми, не должны быть равны null и должны содержать корректные данные.
Критерии оценки
Создан вложенный класс Key.
Созданы параметры класса.
Все параметры вложенного класса помечены модификатором доступа private.
Создан конструктор для создания нового объекта класса.
 */

import java.util.Calendar;

public class Main {
    static int month;
    public static void main(String[] args) {
        System.out.println("Курс 2. Задание 2.");
        Car[] car = new Car[5];
        car[0] = new Car("Lada", "Granta", 1.7, "Желтый", 2015, "Россия","МКПП","Седан","А550АА50",5,true);
        car[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия", "АКПП", "Седан","о444оо85",2,false);
        car[2] = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия","МКПП","Седан","у873ок76", 2,false);
        car[3] = new Car("Kia", "Sportage 4", 2.4, "Красный", 2018, "Южная Корея","АКПП6","SUV","к877кк77",5,true);
        car[4] = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея","робот","седан","у666уу43",0,false);

        printInfo(car);
        Calendar calendar = Calendar.getInstance();
        month = calendar.get(Calendar.MONTH);
        System.out.println("Смена сезонной резины");
        changeRubberSeason(car, month);
        printInfo(car);

    }
    public static String printInfo(Car[] cars) {
        for (int i = 0; i < cars.length ; i++) {
            System.out.println(cars[i]);
        }
        return ""+cars;
    }

    private static String changeRubberSeason(Car[] car,int month) {
        boolean rubber;
        Car[] carNew = new Car[car.length];
        if ((month >= 10 && month <= 11) || (month >= 0 && month <= 3)) {
            rubber = true;
            for (int i = 0; i < car.length; i++) {
                System.out.println(car[i].isRubber());
                if (car[i].isRubber() != rubber) {
                    System.out.println("Необходимо заменить резину на Зимнюю.");
                    car[i].setRubber(rubber);
                    System.out.println("Заменили на зимнюю.");
                    carNew[i]=car[i];
                } else {
                    System.out.println("У вас уже стоит - Зимняя резина");
                    carNew[i]=car[i];
                }
            }
        }else {
            rubber = false;
            for (int i = 0; i < car.length; i++) {
                System.out.println(car[i].isRubber());
                if (car[i].isRubber() != rubber) {
                   System.out.println("Необходимо заменить резину на Летнюю.");
                    car[i].setRubber(rubber);
                    System.out.println("Заменили на летнюю.");
                    carNew[i]=car[i];
                } else {
                    System.out.println("У вас уже стоит - Летняя резина");
                    carNew[i]=car[i];
                }
            }
        }
        return ""+carNew;
    }
}