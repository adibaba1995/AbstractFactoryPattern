package vehicles.car;

import vehicles.Vehicle;

public class SedanCar implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Accelerating sedan car");
    }

    @Override
    public void brake() {
        System.out.println("Braking sedan car");
    }

    @Override
    public void turn() {
        System.out.println("Turning sedan car");
    }
}
