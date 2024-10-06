package abstractFd;

public abstract class Animal {
    public String name;

    public Animal(String name) {
    this.name = name;
    }

    public String getName(){
        return name;
    }
    public abstract void animalSound();
    public void sleep(){
        System.out.println(name + " sleep: ZZZZZZZ");
    }
}
