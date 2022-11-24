package interfaces;


// Pig "implements" the Animal interface
public class Pig implements Animal {
    public void animalSound(){
        //The body of animalSound() is provided here
        System.out.println("The Pig say: wee wee ");
    }

    @Override
    public void run() {
        System.out.println("runnnn");
    }

    public void sleep(){
        //The body of sleep() is provided here.
        System.out.println("Sleep : zzz");
    }
}
