package Stream.intermediateOperations;

import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
//        Java core for Stream map(Function mapper)
//        to get a stream by applying the given function to this stream
        System.out.println("The Stream after applying"+
                "the function is: ");
//        Creating a list of Integers
        List<Integer> list = Arrays.asList(3,6,9,12,15);
//        Using Stream map(Function mapper) and displaying the corresponding new stream
                list.stream().map(number -> number * 3).forEach(System.out :: println);
    }
}
