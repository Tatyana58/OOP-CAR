package transport;
import java.util.Calendar;

public class Main {
    static int month;
    public static void main(String[] args) {
        System.out.println("Курс 2. Задание 2.");
        Car[] car = new Car[5];
        car[0] = new Car( "Лада","Granta",  1.7, "", 2015, "Россия",200,"МКПП","Седан","у550уу150",5,true,new Car.KeyCar(true,true));
        car[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия", 0,"АКПП", "Седан","о444оо85",2,false,new Car.KeyCar(true,true));
        car[2] = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия",500,"МКПП","Седан","у873ок76", 2,false,new Car.KeyCar(false,false));
        car[3] = new Car("Kia", "Sportage 4", 2.4, "Красный", 2018, "Южная Корея",600,"АКПП6","SUV","к877кк77",5,true,new Car.KeyCar(true,false));
        car[4] = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея",240,"робот","седан","у666уу43",0,false,new Car.KeyCar(false,true));

        printInfo(car);
        Calendar calendar = Calendar.getInstance();
        month = calendar.get(Calendar.MONTH);
        //System.out.println("Смена сезонной резины");
        //changeRubberSeason(car, month);
        //printInfo(car);
        Bus[] bus = new Bus[3];
        bus[0] = new Bus("ЛиАЗ", "5256","зеленый",2015,"Россия",90);
        bus[1] = new Bus("НефАЗ", "5299","синий",2020,"Россия",80);
        bus[2] = new Bus("МАЗ", "103","желтый",2021,"Белорусия",100);
        printInfoBas(bus);


    }
    public static String printInfo(Car[] cars) {
        for (int i = 0; i < cars.length ; i++) {
            System.out.println(cars[i]);
        }
        return ""+cars;
    }
    public static String printInfoBas(Bus[] bus) {
        for (int i = 0; i < bus.length ; i++) {
            System.out.println(bus[i]);
        }
        return ""+bus;
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