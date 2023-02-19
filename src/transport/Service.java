package transport;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Service {
    private Queue<Transport> queue;

    public Service(Queue<Transport> queue) {
        this.queue = queue;
    }

    public void addCarQueue(Transport transport) { //добавить авто в очередь
        if (transport.checkTransportNeedService()) {
            queue.add(transport);
        }
    }

//    public void carryOutTechnicalInspectionCar() { //провести техосмотр авто
//        if (!queue.isEmpty()) {
//            Transport transport= queue.poll();
//            transport.repair();
//        }
//    }

    public void carryOutAVehicleInspection(Queue<Transport> queue) {
        if (queue.isEmpty()) {
            System.out.println("У данного транспортного средства нет механика");
        } else {
            while (!queue.isEmpty()){
                Transport currentTransport = queue.poll();
                List<Mechanic> mechanics= currentTransport.getMechanic();
                for (Mechanic mechanic : mechanics) {
                    mechanic.performMaintenance(currentTransport);
                }
                currentTransport.repair();
                //Mechanic mechanic = (Mechanic) currentTransport.getMechanic().get(0);
            }
        }
    }
}
