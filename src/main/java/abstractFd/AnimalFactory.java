package abstractFd;
// Factory Method Pattern
public class AnimalFactory {
    public Animal createAnimal(String type, String name){
        if(type.equalsIgnoreCase("dog")){
            return new Dog(name);
        }
       else if(type.equalsIgnoreCase("pig")){
            return new Pig(name);
        }
       return null;
    }
}
