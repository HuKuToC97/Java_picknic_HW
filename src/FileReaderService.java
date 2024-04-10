package src;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileReaderService {
    public static List<String> readWordsFromFile(String filename) throws IOException {
        File file = new File(filename);
        List<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.addAll(Arrays.asList(line.split("\\s+")));
            }
        }
        return words;
    }
}
