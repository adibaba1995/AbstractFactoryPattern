package vehicles.bus;

import vehicles.Vehicle;

public class DoubleDeckerBus implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Accelerating double decker bus");
    }

    @Override
    public void brake() {
        System.out.println("Braking double decker bus");
    }

    @Override
    public void turn() {
        System.out.println("Turning double decker bus");
    }
}
