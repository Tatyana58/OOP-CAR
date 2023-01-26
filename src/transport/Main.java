package transport;
import java.io.PrintStream;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Курс 2. Задание 2.");
//        Car[] car = new Car[5];
//        car[0] = new Car( "Лада","Granta",  1.7, "", 2015, "Россия",200,"МКПП","Седан","у550уу150",5,true,new Car.KeyCar(true,true));
//        car[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия", 0,"АКПП", "Седан","о444оо85",2,false,new Car.KeyCar(true,true));
//        car[2] = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия",500,"МКПП","Седан","у873ок76", 2,false,new Car.KeyCar(false,false));
//        car[3] = new Car("Kia", "Sportage 4", 2.4, "Красный", 2018, "Южная Корея",600,"АКПП6","SUV","к877кк77",5,true,new Car.KeyCar(true,false));
//        car[4] = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея",240,"робот","седан","у666уу43",0,false,new Car.KeyCar(false,true));
//        printInfo(car);

        //Bus[] bus = new Bus[4];
//        bus[0] = new Bus("ЛиАЗ", "5256",6.7);
//        bus[1] = new Bus("НефАЗ", "5299",7.5);
//        bus[2] = new Bus("МАЗ", "103",6.4);
//        bus[3] = new Bus("ПАЗ", "3205",4.25);
//        printInfoBus(bus);

        Competing[] competings = new Competing[4];
        competings[0] = new Bus("ЛиАЗ", "5256", 6.7);
        competings[1] = new Bus("НефАЗ", "5299", 7.5);
        competings[2] = new Bus("МАЗ", "103", 6.4);
        competings[3] = new Bus("ПАЗ", "3205", 4.25);

        printInfoTransport(competings);
        Competing.print(competings);



        competings[0] = new Passenger_car("Нива", "2121", 1.7);
        competings[1] = new Passenger_car("Лада", "Гранта", 1.6);
        competings[2] = new Passenger_car("Москвич", "3", 1.5);
        competings[3] = new Passenger_car("Лада", "Веста", 1.6);
        printInfoTransport(competings);
        Competing.print(competings);


//        Passenger_car[] passenger_cars = new Passenger_car[4];
//        passenger_cars[0] = new Passenger_car("Нива", "2121", 1.7);
//        passenger_cars[1] = new Passenger_car("Лада", "Гранта", 1.6);
//        passenger_cars[2] = new Passenger_car("Москвич", "3", 1.5);
//        passenger_cars[3] = new Passenger_car("Лада", "Веста", 1.6);
//        printInfoPassenger(passenger_cars);



//        Tracks_car[] tracks_cars = new Tracks_car[4];
//        tracks_cars[0] = new Tracks_car("Камаз", "65801", 6.7);
//        tracks_cars[1] = new Tracks_car("МАЗ", "6501", 11.6);
//        tracks_cars[2] = new Tracks_car("ЗИЛ", "157", 5.0);
//        tracks_cars[3] = new Tracks_car("ГАЗ", "66", 4.3);
//        printInfoTracks_car(tracks_cars);


        competings[0] = new Tracks_car("Камаз", "65801", 6.7);
        competings[1] = new Tracks_car("МАЗ", "6501", 11.6);
        competings[2] = new Tracks_car("ЗИЛ", "157", 5.0);
        competings[3] = new Tracks_car("ГАЗ", "66", 4.3);
        printInfoTransport(competings);
        Competing.print(competings);

    }


    //    public static String printInfo(Car[] cars) {
//        for (int i = 0; i < cars.length ; i++) {
//            System.out.println(cars[i]);
//        }
//        return ""+cars;
//    }
    public static String printInfoTransport(Competing[] auto) {
        for (int i = 0; i < auto.length ; i++) {
            System.out.println(auto[i]);
        }
        return ""+auto;
    }

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