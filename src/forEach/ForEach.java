package forEach;

import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }

        String [] cars = {"BMW M2", "Veloster N", "Honda"};
        for(String car : cars){
            System.out.println("car: "+car);
        }

        ArrayList<String> myFamilys = new ArrayList<>();
        myFamilys.add("Oanh");
        myFamilys.add("Tuan");
        myFamilys.add("Dung");
        System.out.println(myFamilys);
        for(String myFamily : myFamilys){
            System.out.println(myFamily);
        }
        System.out.println("-------------------------");
        
    }
}
