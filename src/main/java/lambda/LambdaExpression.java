package lambda;


import enumertation.interfaces.Printable;

import java.util.ArrayList;
import java.util.function.Consumer;



public class LambdaExpression {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(15);
        numbers.forEach((n) -> {
            System.out.println(n);
        });
        System.out.println("-------------------------");
        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };
        numbers.forEach(method);

        System.out.println("--------------------------------");
//        interfaces.Cat myCat = new interfaces.Cat();
   Printable lambdaPrintable = (s) -> s;
   printThing(lambdaPrintable);


    }
    static void printThing(Printable thing){
       thing.print("!");


    }



}
