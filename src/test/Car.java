package test;

public class Car {
    int speed;

    int price;
    String name;
    public Car(int sp , String name){
        this.speed = sp;

        this.name = name;

        this.price = 15;
    }


    public void speedUp(){
         this.speed = this.speed * 2;
    }
    public int getSpeed() {
        return speed;
    }



    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
