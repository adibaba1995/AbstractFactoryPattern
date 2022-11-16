package vehicles.factory;

import vehicles.Vehicle;

/*
    Create new class by implementing this class to create new Vehicle Factory
 */
public interface VehicleFactory {
    public Vehicle createVehicle(String type);
}
