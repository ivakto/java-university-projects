package seminars.sem4;

import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface StringTransformer {
    String transform(String input);
}

public class FunctionalInterfaceDemo {
    public static List<String> applyTransform(List<String> input, StringTransformer transformer) {
        return input.stream()
                    .map(transformer::transform) 
                    .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "Stream", "API");
        System.out.println("Оригинален списък: " + words);

        StringTransformer upperCaseTransformer = input -> input.toUpperCase();
        List<String> upperCaseList = applyTransform(words, upperCaseTransformer);
        System.out.println("\n1. Главни букви: " + upperCaseList);

        StringTransformer prefixTransformer = s -> ">> " + s;
        List<String> prefixedList = applyTransform(words, prefixTransformer);
        System.out.println("2. С префикс: " + prefixedList);

        StringTransformer subStringTransformer = input -> {
            int length = input.length();
            return input.substring(0, Math.min(3, length));
        };
        
        List<String> subStringList = applyTransform(words, subStringTransformer);
        System.out.println("3. Първи 3 символа: " + subStringList);
    }
}
