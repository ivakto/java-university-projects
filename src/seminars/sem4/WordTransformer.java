package seminars.sem4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WordTransformer {
    public static List<String> transformWords(List<String> words) {
        return words.stream()
            .filter(word -> word.length() >= 5) 
            .map(String::toUpperCase) 
            .distinct() 
            .sorted(
                Comparator.comparing(String::length)
                .thenComparing(Comparator.naturalOrder())
            )
            .collect(Collectors.toList());
    }
}
