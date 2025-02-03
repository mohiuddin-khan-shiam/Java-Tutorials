// Advanced/Streams.java

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter: Get even numbers
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // Map: Square each number
        List<Integer> squaredNumbers = numbers.stream()
                                              .map(n -> n * n)
                                              .collect(Collectors.toList());
        System.out.println("Squared Numbers: " + squaredNumbers);

        // Reduce: Sum of all numbers
        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of Numbers: " + sum);

        // Filter, Map, and Collect combined: Square of even numbers
        List<Integer> squaredEvens = numbers.stream()
                                            .filter(n -> n % 2 == 0)
                                            .map(n -> n * n)
                                            .collect(Collectors.toList());
        System.out.println("Squared Even Numbers: " + squaredEvens);

        // Using forEach to print numbers
        System.out.println("\nPrinting numbers using forEach:");
        numbers.stream().forEach(System.out::println);
    }
}
