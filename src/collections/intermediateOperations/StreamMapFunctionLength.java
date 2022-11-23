package collections.intermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapFunctionLength {
    public static void main(String[] args){
        System.out.println("The Strean after aoolying the function is: ");
//        Creating a list of strings
        List<String> list = Arrays.asList("january", "february","march");
        List<Integer> listLength = list.stream().map(mon -> mon.length()).collect(Collectors.toList());
        System.out.println(listLength);
    }
}
