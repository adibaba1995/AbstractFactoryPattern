package vehicles.car;

import vehicles.Constants;
import vehicles.Vehicle;
import vehicles.factory.VehicleFactory;

public class CarFactory implements VehicleFactory {

    private static CarFactory instance;

    private CarFactory(){}

    public static CarFactory getInstance() {
        if(instance == null)
            instance = new CarFactory();
        return instance;
    }

    @Override
    public Vehicle createVehicle(String type) {
        switch (type) {
            case Constants.VEHICLE_TYPE.CAR.SEDAN:
                return new SedanCar();
            case Constants.VEHICLE_TYPE.CAR.SPORTS:
                return new SportsCar();
            default: return null;
        }

    }
}
