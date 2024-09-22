import Service.ServiceStation;
import Transport.Bicycle;
import Transport.Car;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();

        Truck truck = new Truck("ТАТРА", 6);
        Car car = new Car("LADA", 4);
        Bicycle bicycle = new Bicycle("BMX", 2);

        serviceStation.service(truck);
        serviceStation.service(car);
        serviceStation.service(bicycle);

    }
}