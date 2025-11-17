package seminars.sem4;

import java.util.List;
import java.util.stream.Collectors;

public class NumberFulter {

    public static List<Integer> getEvenNumbersGreaterThan10(List<Integer> numbers) {
        return numbers.stream()
                      .filter(n -> n > 10)
                      .filter(n -> n % 2 == 0)
                      .sorted()
                      .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Integer> input = List.of(5, 12, 8, 20, 13, 14);

        System.out.println("Входен списък: " + input);

        List<Integer> result = getEvenNumbersGreaterThan10(input);

        System.out.println("Резултат: " + result);
    }
}
