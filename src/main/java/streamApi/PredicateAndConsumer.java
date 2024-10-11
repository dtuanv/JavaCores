package streamApi;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumer {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (n) -> n%2 == 0;

        System.out.println("is 4 even? - "+isEven.test(4));
        System.out.println("is 5 even? - "+isEven.test(5));

        Predicate<Integer> isPositive = (n) -> n > 0;
        Predicate<Integer> isOdd = (n) -> n % 2 != 0;

        Predicate<Integer> positiveAndOdd = isPositive.and(isOdd);

        System.out.println("is 3 positiveAndOdd ? - "+positiveAndOdd.test(3));
        System.out.println("is -3 positiveAndOdd ? - "+positiveAndOdd.test(-3));
        System.out.println("-----------Consumer---------------");

        Consumer<String> print = (s) -> System.out.println(s);

        print.accept("Xin chao!!");
    }
}
