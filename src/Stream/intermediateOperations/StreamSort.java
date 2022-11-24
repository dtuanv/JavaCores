package Stream.intermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {
    public static void main(String[] args){
        List<Integer> listNumber = Arrays.asList(5,9,25,2,15,6);

        List<Integer> result = listNumber.stream().sorted().collect(Collectors.toList());
        System.out.println("result"+ result);
    }
}
