package interfaces;

public class Main {
    public static void main(String[] args){
        Pig myPig = new Pig(); //create a Pig Object
        myPig.animalSound();
        myPig.run();
        myPig.sleep();

        Vehicle car = new Car();
        Vehicle motorbike = new Motorbike();


        VehicleControl vehicleControlMotorbike = new VehicleControl(motorbike);
        vehicleControlMotorbike.control();
        VehicleControl vehicleControl = new VehicleControl(car);
        vehicleControl.control();
    }
}
