package edu.lesson12.homework12.task1.Util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;

public class LettersUtil {

    public static Map<Character, Integer> calculateLetters(String fileName) {
        Path path = Paths.get("src", "edu", "lesson12", "homework12", "task1", fileName);
        File file = path.toFile();
        Map<Character, Integer> result = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.toLowerCase();
                for (int i = 0; i < line.length(); i++) {
                    char element = line.charAt(i);
                    if (Character.isLetter(element)) {
                        Integer count = result.get(element);
                        if (count != null) {
                            count += 1;
                        } else {
                            count = 1;
                        }
                        result.put(element, count);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно найти файл: " + file.getName());
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл: " + file.getName());
        }
        return result;
    }
}
