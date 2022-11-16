package vehicles.bus;

import vehicles.Vehicle;

public class SingleDeckerBus implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Accelerating single decker bus");
    }

    @Override
    public void brake() {
        System.out.println("Braking single decker bus");
    }

    @Override
    public void turn() {
        System.out.println("Turning single decker bus");
    }
}
