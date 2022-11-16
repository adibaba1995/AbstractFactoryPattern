package vehicles.factory;

import vehicles.Constants;
import vehicles.Vehicle;
import vehicles.bus.BusFactory;
import vehicles.car.CarFactory;

import java.lang.reflect.Field;

/*
    A variant of Abstract Factory pattern.
    In this implementation, we just pass type of object to be created. A particular Factory is chosen based on type of object.
 */
public class MoreAbstractVehicleFactory implements VehicleFactory{

    private MoreAbstractVehicleFactory() {}

    private static MoreAbstractVehicleFactory instance;
    public static MoreAbstractVehicleFactory getInstance() {
        if(instance == null) {
            instance = new MoreAbstractVehicleFactory();
        }
        return instance;
    }

    /*
        If type matches item from set of constants, that particular factory will be chosen.
     */
    @Override
    public Vehicle createVehicle(String type) {
        try {
            for (Field f : Constants.VEHICLE_TYPE.CAR.class.getDeclaredFields()) {
                String value = (String) f.get(null);
                if(value == type) {
                    return CarFactory.getInstance().createVehicle(type);
                }
            }
            for (Field f : Constants.VEHICLE_TYPE.BUS.class.getDeclaredFields()) {
                String value = (String) f.get(null);
                if(value == type) {
                    return BusFactory.getInstance().createVehicle(type);
                }
            }
        } catch(IllegalAccessException ex) {

        }
        return null;
    }
}
