import java.util.LinkedHashMap;
import java.util.Map;

public class Top10 { private final Map<String, Integer> words = new LinkedHashMap<>();

    public Top10(String string) {
        for (String word : string.split("\\s")
        ) {
            if (words.containsKey(word)) {
                words.put(word, words.get(word) + 1);
            } else {
                words.put(word, 1);
            }
        }
    }

    public void printResult() {
        System.out.println("В тексте"  + words.size() + " слов");
        words.entrySet().stream().
                limit(10)
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry -> System.out.println(entry.getValue() +
                        " - " +
                        entry.getKey()));
    }

}