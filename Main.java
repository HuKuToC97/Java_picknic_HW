import java.io.IOException;
import java.util.List;
import java.util.Map;

import src.FileReaderService;
import src.WordAnalyzer;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        try {
            List<String> words = FileReaderService.readWordsFromFile("input.txt");
            WordAnalyzer analyzer = new WordAnalyzer(words);
            
            System.out.println("Total number of words: " + analyzer.countWords());
            System.out.println("Longest word: " + analyzer.findLongestWord());
            System.out.println("Word frequencies: ");
            Map<String, Integer> frequencies = analyzer.calculateWordFrequencies();
            frequencies.forEach((word, count) -> System.out.println(word + ": " + count));
        } catch (IOException e) {
            System.out.println("Error processing the file: " + e.getMessage());
        }
    }
    
}