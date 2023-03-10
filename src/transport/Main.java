package transport;

import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Mechanic> mechanic = new ArrayList<>();
        mechanic.add(new Mechanic("Иванов Иван Иванович", "АвтоСТО"));
        mechanic.add(new Mechanic("Сидоров Олег Петрович", "СТОплюс"));
        mechanic.add(new Mechanic("Кулаков Михаил Иванович", "Макаров и Ко"));
        mechanic.add(new Mechanic("Фролов Александр Васильевич", "АвтоЛеди"));

        Mechanic mechanicOrlov = new Mechanic("Орлов Сергей Сергеевич", "ПитСтоп");
        Mechanic mechanicFrolov = new Mechanic("Фролов Александр Васильевич", "АвтоЛеди");


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

        PassengerСar[] passengerCars = new PassengerСar[4];
        passengerCars[0] = new PassengerСar("Нива", "2121", 1.7, driversB[0], "Внедорожник", PassengerСar.TypeCar.PASSENGER, Collections.singletonList(mechanic.get(1)));
        passengerCars[1] = new PassengerСar("Лада", "Гранта", 1.6, driversB[1], "Седан", PassengerСar.TypeCar.PASSENGER, Collections.singletonList(mechanic.get(3)));
        passengerCars[2] = new PassengerСar("Москвич", "3", 1.5, driversB[2], "Пикап", PassengerСar.TypeCar.PASSENGER, Collections.singletonList(mechanic.get(0)));
        passengerCars[3] = new PassengerСar("Лада", "Веста", 1.6, driversB[3], "Седан", PassengerСar.TypeCar.PASSENGER, Collections.singletonList(mechanic.get(2)));

        printInfoTransport(passengerCars);
        for (int i = 0; i < 4; i++) {
            checkTransport(passengerCars[i]);
        }

        double[] gravity = {35, 4, 1.6, 1000};
        TracksCar[] tracksCars = new TracksCar[4];
        tracksCars[0] = new TracksCar("Камаз", "65801", 6.7, driversC[0], LoadCapacity.getValue(gravity[0]), TracksCar.TypeCar.TRACK, Collections.singletonList(mechanic.get(1)));
        tracksCars[1] = new TracksCar("МАЗ", "6501", 11.6, driversC[1], LoadCapacity.getValue(gravity[1]), TracksCar.TypeCar.TRACK, Collections.singletonList(mechanic.get(0)));
        tracksCars[2] = new TracksCar("ЗИЛ", "157", 5.0, driversC[2], LoadCapacity.getValue(gravity[2]), TracksCar.TypeCar.TRACK, Collections.singletonList(mechanic.get(2)));
        tracksCars[3] = new TracksCar("ГАЗ", "66", 4.3, driversC[3], LoadCapacity.getValue(gravity[3]), TracksCar.TypeCar.TRACK, Collections.singletonList(mechanic.get(3)));

        for (int i = 0; i < 4; i++) {
            printInfo1(tracksCars[i], gravity[i]);
        }
        for (int i = 0; i < 4; i++) {
            checkTransport(tracksCars[i]);
        }

        int[] capacity = {50, 10, 90, 150};
        Bus[] bus = new Bus[4];
        bus[0] = new Bus("ЛиАЗ", "5256", 6.7, driversD[0], CapacityBus.getValue(capacity[0]), Bus.TypeCar.BUS_ENUM, Collections.singletonList(mechanic.get(3)));
        bus[1] = new Bus("НефАЗ", "5299", 7.5, driversD[1], CapacityBus.getValue(capacity[1]), Bus.TypeCar.BUS_ENUM, Collections.singletonList(mechanic.get(0)));
        bus[2] = new Bus("МАЗ", "103", 6.4, driversD[2], CapacityBus.getValue(capacity[2]), Bus.TypeCar.BUS_ENUM, Collections.singletonList(mechanic.get(2)));
        bus[3] = new Bus("ПАЗ", "3205", 4.25, driversD[3], CapacityBus.getValue(capacity[3]), Bus.TypeCar.BUS_ENUM, Collections.singletonList(mechanic.get(1)));

        System.out.println("-------1 часть ------------");

        List<Transport> racers = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            //printInfo(passenger_cars[i]);
            printInfo2(bus[i], capacity[i]);
            //printInfoTrack(tracks_cars[i]);
            //printInfo(bus[i]);
            //checkTransport(passengerCars[i],tracksCars[i],bus[i]);

            racers.add(passengerCars[i]);
            racers.add(tracksCars[i]);
            racers.add(bus[i]);
            mechanicOrlov.fixCar(bus[i]);
            mechanicOrlov.performMaintenance(bus[i]);
            mechanicFrolov.fixCar(passengerCars[i]);
            mechanicFrolov.performMaintenance(passengerCars[i]);
            mechanicOrlov.fixCar(tracksCars[i]);
            mechanicFrolov.performMaintenance(tracksCars[i]);
        }
        System.out.println("Конец............");
        System.out.println("-------2 часть ------------");
        System.out.println("Автобусы в очередь на Техосмотр перед заездом не встают.\n");

        Queue<Transport> transportsOnSTO = new ArrayDeque<>();

        Service sto = new Service(transportsOnSTO);
        for (Transport transport : racers) {
            sto.addCarQueue(transport);
        }

        for (int j = 1; j <= transportsOnSTO.size(); j++) {
            sto.carryOutAVehicleInspection(transportsOnSTO);
        }
        System.out.println("Конец............");
        System.out.println("-------3 часть ------------");

        Map<Transport, List<Mechanic>> transportToMechanics = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            transportToMechanics.put(passengerCars[i], mechanic);
            transportToMechanics.put(tracksCars[i], mechanic);
            transportToMechanics.put(bus[i], mechanic);
            for (Map.Entry<Transport, List<Mechanic>> map : transportToMechanics.entrySet()) {
                System.out.println(map);
            }
        }
        System.out.println("Конец............");


        System.out.println("-------1 часть  HASHSET   ------------");
        Set<DriverB> driverB = new HashSet<>();

        driverB.add(new DriverB("Петров В.С.", true, 15));
        driverB.add(new DriverB("Степанов К.А.", true, 7));
        driverB.add(new DriverB("Усачев С.Ю.", true, 19));
        driverB.add(new DriverB("Миронов А.М.", true, 24));
        driverB.add(new DriverB("Рогачев В.И.", true, 1));
        driverB.add(new DriverB("Рогачев В.И.", true, 1));
        driverB.add(new DriverB("Рогачев В.И.", true, 1));

        System.out.println(driverB);

        System.out.println("-------2 часть ITERATOR  ------------");

        Iterator<DriverB> iterName = driverB.iterator();

        // В цикле while проверяем, есть ли следующий элемент,
        // если есть, то входим в цикл
        while (iterName.hasNext()) {
            System.out.println(iterName.next());
        }
    }

//        Queue<Transport> queue = new LinkedList<>();

        // Наполняем очередь объектами с помощью метода offer
//        queue.offer(new PassengerСar("ХАХАХА", "2121", 1.7, driversB[0], "Внедорожник", PassengerСar.TypeCar.PASSENGER, Collections.singletonList(mechanic.get(1))));
//        queue.offer(new PassengerСar("УХУХУХУХУХУ", "Гранта", 1.6, driversB[1], "Седан", PassengerСar.TypeCar.PASSENGER, Collections.singletonList(mechanic.get(3))));
//        queue.offer(new TracksCar("Камаз", "65801", 6.7, driversC[0], LoadCapacity.getValue(gravity[0]), TracksCar.TypeCar.TRACK, Collections.singletonList(mechanic.get(1))));
//        queue.offer(new TracksCar("ГАЗАЗАЗА", "66", 4.3, driversC[3], LoadCapacity.getValue(gravity[3]), TracksCar.TypeCar.TRACK, Collections.singletonList(mechanic.get(2))));
//        queue.offer(new TracksCar("УАЗИК", "3457", 5.1, driversC[1], LoadCapacity.getValue(gravity[1]), TracksCar.TypeCar.TRACK, Collections.singletonList(mechanic.get(0))));
//        queue.offer(new Bus("МАЗ", "103", 6.4, driversD[2], CapacityBus.getValue(capacity[2]), Bus.TypeCar.BUS_ENUM, Collections.singletonList(mechanic.get(2))));
//        queue.offer(new Bus("ПАЗ", "3205", 4.25, driversD[3], CapacityBus.getValue(capacity[3]), Bus.TypeCar.BUS_ENUM, Collections.singletonList(mechanic.get(1))));

//        System.out.println("Очередь....");
//        //System.out.println(queue.poll());// удаление 1 - го элемента
//        System.out.println(queue.peek());// Вывод на экран - 1- го элемента
//        String town;
//        while ((queue.poll()) != null) {
//            // Выводим элементы на экран
//            System.out.println(queue.peek());
//        }

//        //Исключения
//        for (int i = 0; i < 4; i++) {
//            checkTransport(bus[i]);
//        }


    public static void checkTransport(Transport... transports) { //проверка на исключения
        for (Transport transport : transports) {
            try {
               transport.passDiagnostics();
                    //throw new TransportTypeException(transport.getBrand()+transport.getModel() + " НЕ прошел диагностику");
            } catch (TransportTypeException e) {
                        e.printStackTrace();
            }
        }
    }

    public static void print1() {
        TracksCar.TypeCar.TRACK.printType();
    }

    private static void printInfo(transport.Transport transport) {
        Bus.TypeCar.BUS_ENUM.printType();
        System.out.println("Водитель " + transport.getDriver().getFcsDriver() +
                " управляет авто " + transport.getBrand() + Bus.TypeCar.BUS_ENUM.getBusEnum() +
                ", модель " + transport.getModel() + ", объем двигателя " +
                transport.getEngineCapacity() + " и будет участвовать в заезде. ");
    }

    private static void printInfo1(transport.Transport transport, double gravity) { //Грузовой
//        if (gravity >= 501) {
//            System.out.println("Водитель " + trasport.getDriver().getFcsDriver() +
//                    " управляет авто " + trasport.getBrand() + Tracks_car.TypeCar.TRACK.getTrackEnum() +
//                    trasport.getEngineCapacity() + " Грузоподьемностью до 500" + " и будет участвовать в заезде.");
//
//        } else {
        System.out.println("Водитель " + transport.getDriver().getFcsDriver() +
                " управляет авто " + transport.getBrand() + TracksCar.TypeCar.TRACK.getTrackEnum() +
                transport.getEngineCapacity() + " " + LoadCapacity.getValue(gravity) + " и будет участвовать в заезде.");
//        }
    }

    private static void printInfo2(Transport transport, int capacity) { // Автобус
        System.out.println("Водитель " + transport.getDriver().getFcsDriver() +
                " управляет авто " + transport.getBrand() + Bus.TypeCar.BUS_ENUM.getBusEnum() +
                ", модель " + transport.getModel() + ", объем двигателя " +
                transport.getEngineCapacity() + " " + CapacityBus.getValue(capacity) + " и будет участвовать в заезде.");//+ transport.getMechanic());
    }

    public static String printInfoTransport(PassengerСar[] bus) {
        for (int i = 0; i < bus.length; i++) {
            System.out.println(PassengerСar.TypeCar.PASSENGER.printType() + ", " + bus[i]);
        }
        return BodyType.SUV.toString();
    }
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
