package vehicles.car;

import vehicles.Vehicle;

public class SportsCar implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Accelerating sports car");
    }

    @Override
    public void brake() {
        System.out.println("Braking sports car");
    }

    @Override
    public void turn() {
        System.out.println("Turning sports car");
    }
}
