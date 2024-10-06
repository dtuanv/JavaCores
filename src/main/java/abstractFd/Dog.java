package abstractFd;

public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }
    @Override
    public void animalSound() {
        System.out.println("The dog "+name+" says: Gau Gau");
    }
    @Override
    public void sleep(){
        System.out.println(name + " dog  sleep: ZZZZZZZ");
    }

}
