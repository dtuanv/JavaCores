package Stream.intermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapToConvert {
    public static void main(String[] args){
        System.out.println("The Stream after applying the function is : ");
//        Creating a list of Strings
        List<String> list = Arrays.asList("Monday", "tuesday", "wednesday");
    List<String> result =    list.stream().map(String :: toUpperCase).collect(Collectors.toList());
        System.out.println(result);
    }
}
