package vehicles.bus;

import vehicles.Constants;
import vehicles.Vehicle;
import vehicles.factory.VehicleFactory;

public class BusFactory implements VehicleFactory {
    private static BusFactory instance;
    private BusFactory(){}
    public static BusFactory getInstance() {
        if (instance == null)
            instance = new BusFactory();
        return instance;
    }

    @Override
    public Vehicle createVehicle(String type) {
        switch (type) {
            case Constants.VEHICLE_TYPE.BUS.SINGLE_DECKER:
                return new SingleDeckerBus();
            case Constants.VEHICLE_TYPE.BUS.DOUBLE_DECKER:
                return new DoubleDeckerBus();
            default: return null;
        }
    }
}
