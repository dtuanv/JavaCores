package abstractFd;

public class Pig extends Animal{
    public Pig(String name) {
        super(name);
    }

    @Override
    public void animalSound() {
//        the body of animalSound() is provided here
        System.out.println("The pig "+name +" says: wee wee");
    }


}



