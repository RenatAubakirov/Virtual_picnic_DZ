package com.programa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWordFinder {
    private File file;

    public LongestWordFinder(File file) {
        this.file = file;
    }

    public String findLongestWord() {
        String longestWord = "";
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return longestWord;
    }
}
