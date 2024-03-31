package com.programa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCalculator {
    private File file;

    public WordFrequencyCalculator(File file) {
        this.file = file;
    }

    public Map<String, Integer> calculateWordFrequency() {
        Map<String, Integer> wordFrequency = new HashMap<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String word = scanner.next();
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return wordFrequency;
    }
}
