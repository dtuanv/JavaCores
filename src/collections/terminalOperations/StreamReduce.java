package collections.terminalOperations;

import java.util.Arrays;
import java.util.List;

public class StreamReduce {
    public static void main(String[] args){
        List<Integer> number = Arrays.asList(2,3,4,5,6);
        int even = number.stream().filter(x->x%2==0).reduce(2,(ans,i)-> ans+i);
        System.out.println("even " +even);
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");

        int resultWithSum = number.stream().reduce(0, Integer::sum);
        System.out.println("resultWithSum" +resultWithSum);

//        For instance, we can use reduce() on an array of String elements and join them into a single result:
        String result = letters
                .stream()
                .reduce("", (partialString, element) -> partialString + element);

        //        Similarly, we can switch to the version that uses a method reference:


        String resultWithMethod = letters.stream().reduce("", String::concat);

//        Let's use the reduce() operation for joining the uppercase elements of the letters array:
        String resultToUpperCase = letters
                .stream()
                .reduce(
                        "", (partialString, element) -> partialString.toUpperCase() + element.toUpperCase());

//        In addition, we can use reduce() in a parallelized stream (more on this later):
        List<Integer> ages = Arrays.asList(25, 30, 45, 28, 32);
        int computedAges = ages.parallelStream().reduce(0, (a, b) -> a + b, Integer::sum);

        int resultWithSumByParalle = ages.stream().reduce(0, Integer::sum);

        System.out.println("resultWithSumByParalle "+resultWithSumByParalle);
        System.out.println("computedAges "+computedAges);
        System.out.println("result: "+result);
        System.out.println("result with Method: "+resultWithMethod);
    }
}
