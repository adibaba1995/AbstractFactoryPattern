import vehicles.*;
import vehicles.factory.MoreAbstractVehicleFactory;
import vehicles.factory.VehicleFactory;
import vehicles.factory.VehicleFactoryCreator;

public class Client {
    public static void main(String[] args) {
        VehicleFactory carFactory = VehicleFactoryCreator.getVehicleFactory(Constants.FACTORY_TYPE.CAR_FACTORY);
        Vehicle sedan = carFactory.createVehicle(Constants.VEHICLE_TYPE.CAR.SEDAN);
        sedan.accelerate();
        sedan.brake();

        VehicleFactory busFactory = VehicleFactoryCreator.getVehicleFactory(Constants.FACTORY_TYPE.BUS_FACTORY);
        Vehicle singleDecker = busFactory.createVehicle(Constants.VEHICLE_TYPE.BUS.SINGLE_DECKER);
        singleDecker.accelerate();
        singleDecker.brake();

        Vehicle sports = MoreAbstractVehicleFactory.getInstance().createVehicle(Constants.VEHICLE_TYPE.CAR.SPORTS);
        sports.accelerate();
        sports.brake();

    }
}
