package transport;

import java.util.Arrays;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {

            DriverB[] driversB = new DriverB[4];
            driversB[0] = new DriverB("ИвановПС", true, 10);
            driversB[1] = new DriverB("ПетровПС", true, 5);
            driversB[2] = new DriverB("СидоровПС", true, 30);
            driversB[3] = new DriverB("ГрачевПС", true, 20);

            DriverC[] driversC = new DriverC[4];
            driversC[0] = new DriverC("СоколовПС", true, 40);
            driversC[1] = new DriverC("ПупкинПС", true, 26);
            driversC[2] = new DriverC("СмирновПС", true, 18);
            driversC[3] = new DriverC("ГромовПС", true, 34);

            DriverD[] driversD = new DriverD[4];
            driversD[0] = new DriverD("МасловПС", true, 40);
            driversD[1] = new DriverD("КозловПС", true, 26);
            driversD[2] = new DriverD("УсинПС", true, 18);
            driversD[3] = new DriverD("ХрамовПС", true, 34);



            Passenger_car[] passenger_cars = new Passenger_car[4];
            passenger_cars[0] = new Passenger_car("Нива", "2121", 1.7, driversB[0],BodyType.TYPE9);
            passenger_cars[1] = new Passenger_car("Лада", "Гранта", 1.6, driversB[1],BodyType.TYPE2);
            passenger_cars[2] = new Passenger_car("Москвич", "3", 1.5, driversB[2],BodyType.TYPE1);
            passenger_cars[3] = new Passenger_car("Лада", "Веста", 1.6, driversB[3],BodyType.TYPE1);

            printInfoTransport(passenger_cars);


           // LoadCapacity loadCapacity = LoadCapacity.N1BEFORY3_5;

            Tracks_car[] tracks_cars = new Tracks_car[4];
            tracks_cars[0] = new Tracks_car("Камаз", "65801", 6.7, driversC[0],LoadCapacity.N3);
            //loadCapacity = LoadCapacity.N3ABOVE12;
            tracks_cars[1] = new Tracks_car("МАЗ", "6501", 11.6, driversC[1],LoadCapacity.N2);
            tracks_cars[2] = new Tracks_car("ЗИЛ", "157", 5.0, driversC[2],LoadCapacity.N3);
            tracks_cars[3] = new Tracks_car("ГАЗ", "66", 4.3, driversC[3],LoadCapacity.N1);

            printInfoTransport(tracks_cars);

            Bus[] bus = new Bus[4];
            bus[0] = new Bus("ЛиАЗ", "5256", 6.7, driversD[0]);
            bus[1] = new Bus("НефАЗ", "5299", 7.5, driversD[1]);
            bus[2] = new Bus("МАЗ", "103", 6.4, driversD[2]);
            bus[3] = new Bus("ПАЗ", "3205", 4.25, driversD[3]);

            printInfoTransport(bus);

            for (int i = 0; i < 4; i++) {
                printInfo(tracks_cars[i]);
                printInfo(passenger_cars[i]);
                printInfo(bus[i]);
            }
    }

    private static void printInfo(Trasport trasport){
        System.out.println("Водитель " + trasport.getDriver().getFcsDriver() +
                " управляет авто " + trasport.getBrand() +
                ", модель " + trasport.getModel() + ", объем двигателя " +
                trasport.getEngineCapacity() +", тип кузова - " +BodyType.TYPE2.toString()+ " и будет участвовать в заезде.");
    }
    public static String printInfoTransport(Trasport[] auto) {
        for (int i = 0; i < auto.length ; i++) {
            System.out.println(auto[i]);
        }
        return ""+ auto;
    }


//        System.out.println("Курс 2. Задание 2.");
//        Car[] car = new Car[5];
//        car[0] = new Car( "Лада","Granta",  1.7, "", 2015, "Россия",200,"МКПП","Седан","у550уу150",5,true,new Car.KeyCar(true,true));
//        car[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия", 0,"АКПП", "Седан","о444оо85",2,false,new Car.KeyCar(true,true));
//        car[2] = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия",500,"МКПП","Седан","у873ок76", 2,false,new Car.KeyCar(false,false));
//        car[3] = new Car("Kia", "Sportage 4", 2.4, "Красный", 2018, "Южная Корея",600,"АКПП6","SUV","к877кк77",5,true,new Car.KeyCar(true,false));
//        car[4] = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея",240,"робот","седан","у666уу43",0,false,new Car.KeyCar(false,true));
//        printInfo(car);

//        Bus[] bus = new Bus[4];
//        bus[0] = new Bus("ЛиАЗ", "5256",6.7);
//        bus[1] = new Bus("НефАЗ", "5299",7.5);
//        bus[2] = new Bus("МАЗ", "103",6.4);
//        bus[3] = new Bus("ПАЗ", "3205",4.25);
//        printInfoBus(bus);



///        Passenger_car[] passenger_cars = new Passenger_car[4];
////        passenger_cars[0] = new Passenger_car("Нива", "2121", 1.7);
////        passenger_cars[1] = new Passenger_car("Лада", "Гранта", 1.6);
////        passenger_cars[2] = new Passenger_car("Москвич", "3", 1.5);
////        passenger_cars[3] = new Passenger_car("Лада", "Веста", 1.6);
////        printInfoPassenger(passenger_cars);
//
//
////        Tracks_car[] tracks_cars = new Tracks_car[4];
////        tracks_cars[0] = new Tracks_car("Камаз", "65801", 6.7);
////        tracks_cars[1] = new Tracks_car("МАЗ", "6501", 11.6);
////        tracks_cars[2] = new Tracks_car("ЗИЛ", "157", 5.0);
////        tracks_cars[3] = new Tracks_car("ГАЗ", "66", 4.3);
////        printInfoTracks_car(tracks_cars);
//        for (int i = 0; i < 4; i++) {
////            DriverB driversB = new DriverB<>("Водитель "+i, true,5+1 );
////            Competing competings = new Passenger_car("Авто"+i, "Модель"+ i, 1.7);
//            printInfo(driversB,competings);
//        }

//    public static String printInfoDriverB(DriverB[] driver){
//        for (int i = 0; i < driver.length ; i++) {
//            System.out.println(driver[i]);
//        }
//        return "" + driver;
//    }


    //    public static String printInfo(Car[] cars) {
//        for (int i = 0; i < cars.length ; i++) {
//            System.out.println(cars[i]);
//        }
//        return ""+cars;
//    }
//    public static String printInfoBus(Bus[] bus) {
//        for (int i = 0; i < bus.length ; i++) {
//            System.out.println(bus[i]);
//        }
//        return ""+bus;
//    }
//    public static String printInfoPassenger(Passenger_car[] bus) {
//        for (int i = 0; i < bus.length ; i++) {
//            System.out.println(bus[i]);
//        }
//        return ""+bus;
//    }
//    public static String printInfoTracks_car(Tracks_car[] bus) {
//        for (int i = 0; i < bus.length ; i++) {
//            System.out.println(bus[i]);
//        }
//        return ""+bus;
//    }


}