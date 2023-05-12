package enumertation.interfaces.person;

public class Action {

    public Person person;

    public Action(Person per){
        this.person = per;
    }

    public void daily(){
        person.speak();
        person.learn();
    }


}
