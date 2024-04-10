package src;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordAnalyzer {
    private List<String> words;

    public WordAnalyzer(List<String> words) {
        this.words = words;
    }

    public int countWords() {
        return words.size();
    }

    public String findLongestWord() {
        return Collections.max(words, Comparator.comparingInt(String::length));
    }

    public Map<String, Integer> calculateWordFrequencies() {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        return frequencyMap;
    }
}
