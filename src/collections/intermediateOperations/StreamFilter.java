package collections.intermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args){
        List<String> nameList = Arrays.asList("Intermediate Operations ", "Terminal Operations","NOBODY");
        List<String> result = nameList.stream().filter(s -> s.contains("Operations")).collect(Collectors.toList());
        System.out.println("result "+result);
    }
}
