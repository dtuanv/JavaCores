package enumertation.interfaces;

public class VehicleControl {

    Vehicle vehicle;
    public VehicleControl(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void control(){
        vehicle.makeSound();

        vehicle.move();
    }
}
