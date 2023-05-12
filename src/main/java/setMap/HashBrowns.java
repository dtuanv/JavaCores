package setMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashBrowns {
    public static void main(String[] args) {
        int[] array = {3,5,1,4};
        System.out.println(array[2]);

        HashSet<String> hSet = new HashSet();
        hSet.add("lemur");
        hSet.add("spider");
        System.out.println(hSet);
        System.out.println(hSet.size());
        System.out.println("---------------------------------------------------");
        HashSet<Integer> hNum = new HashSet<>();
        hNum.add(5);
        hNum.add(20);
        hNum.add(90);
        hNum.add(32);
        hNum.add(64);
        hNum.add(1024);
        hNum.add(512);

        hNum.add(25);
        hNum.add(26);
        hNum.add(1);
        hNum.add(256);

        hNum.add(16);
        hNum.add(1);
        hNum.add(128);
        hNum.add(33);


        System.out.println("HashSet of number List: "+hNum);
        System.out.println("---------------------------");
        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        while(it.hasNext()){
            System.out.println("value of interator"+it.next());
        }

        System.out.println("-------------------------");
        while(it.hasNext()){


                System.out.println("value when i > 2 :  "+ it.next());
            }
        System.out.println("------------------");
        String myStr = "       Hello World!       ";
        System.out.println(myStr);
        System.out.println("with Trim:   "+myStr.trim()); //leer ziffer löschen
        }



    }

