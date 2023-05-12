package doubleColon;

import java.util.Arrays;
import java.util.List;

public class DoubleColon {

    public static void main(String[] args){

        List<Integer> numList = Arrays.asList(5,8,10,15);

        numList.forEach(DoubleColon :: display);
    }

    static void display(int stng) {
        System.out.println(stng);
    };
}
