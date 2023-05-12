package Stream.intermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleArrayStream {


    public static void main(String[] args){
        List<String> arraysList = Arrays.asList("Monday","is","Montag","in German");
SimpleArrayStream simpleArrayStream = new SimpleArrayStream();
        arraysList.stream().forEach(System.out :: print);
//
//        List<Integer> number = new ArrayList<Integer>();
//        number.add(2);
//        number.add(3);
        List<Integer> number = Arrays.asList(2,3);
        List square = number.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println("square"+square);
    }
    private  int caculatePoten(int a){
        return a*a;
    };
}
