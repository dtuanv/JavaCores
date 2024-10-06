package abstractFd;

public class Main {
    public static void main(String[] args){
        Animal myPig = new Pig("Porky"); // create a Pig Object
        myPig.animalSound();
        System.out.println("Pig name "+ myPig.getName());
        myPig.sleep();

        Animal myDog = new Dog("Rex");
        myDog.animalSound();

        System.out.println("Dog name: "+ myDog.name);

        myDog.sleep();

        AnimalFactory animalFactory = new AnimalFactory();

        Animal pigFactory = animalFactory.createAnimal("pig","Peta");

        Animal dogFactory = animalFactory.createAnimal("dog", "Leila");

        pigFactory.animalSound();
        dogFactory.animalSound();


    }
}
