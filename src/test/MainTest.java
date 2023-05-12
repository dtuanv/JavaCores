package test;

public class MainTest {

    public static void main(String args[])
    {
        Car car = new Car(200, "Audi");
        System.out.println("price = :"+ car.price);

        System.out.println("sp : "+car.speed);
        System.out.println("sp  getter: "+car.getSpeed());

        car.setSpeed(250);
        System.out.println("sp : at "+car.speed);
        System.out.println("sp  getter: at "+car.getSpeed());

        car.speedUp();

        System.out.println("sp : at 2 "+car.speed);
        System.out.println("sp  getter: at 2 "+car.getSpeed());

    }
}
