package collections;

public class Room {
    String name;
    int number;
    double rate;

    boolean petFriendly;
    public Room(String name, int number){
        this.name = name;
        this.number = number;
    }
    public Room(String name, int number, double rate){
        this.name = name;
        this.number = number;
        this.rate = rate;
    }
    public boolean isPetFriendly(){
        return petFriendly;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPetFriendly(boolean petFriendly) {
        this.petFriendly = petFriendly;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
